package com.example.order;

import java.io.IOException;
import java.net.ConnectException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.Exceptions;
import reactor.core.publisher.Mono;
import reactor.util.context.Context;
import reactor.util.retry.Retry;
import reactor.util.retry.RetryBackoffSpec;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrderController {

  private final WebClient paymentClient;
  private final RetryBackoffSpec retrySpec;
  private final long paymentTimeoutMs;

  public OrderController(
      WebClient.Builder webClientBuilder,
      @Value("${payment.base-url}") String paymentBaseUrl,
      @Value("${payment.retry.maxAttempts}") int maxAttempts,
      @Value("${payment.retry.minBackoffMs}") long minBackoffMs,
      @Value("${payment.retry.jitter.factor}") double jitterFactor,
      @Value("${payment.timeout.ms}") long paymentTimeoutMs) {

    this.paymentClient = webClientBuilder
        .baseUrl(paymentBaseUrl)
        .build();

    this.retrySpec = Retry
        .backoff(maxAttempts, Duration.ofMillis(minBackoffMs))
        .maxBackoff(Duration.ofSeconds(3))
        .jitter(jitterFactor)
        .filter(this::isTransient)
        .doBeforeRetry(retrySignal -> {
          String orderId = retrySignal.retryContextView().get("orderId");
          log.info("Order={} | Retry attempt #{} due to [{}]: {}",
              orderId,
              retrySignal.totalRetriesInARow() + 1,
              retrySignal.failure().getClass().getSimpleName(),
              retrySignal.failure().getMessage());
        })
        .onRetryExhaustedThrow((spec, rs) -> {
          String orderId = rs.retryContextView().get("orderId");
          log.error("Retries exhausted for order={} after {} attempts. Last cause: {}",
              orderId, rs.totalRetries(), rs.failure().toString());

          return Exceptions.retryExhausted("Retries exhausted for order=" + orderId, rs.failure());
        });

    this.paymentTimeoutMs = paymentTimeoutMs;
  }

  public record Request(String orderId, Long amount) {

  }

  @PostMapping("/{orderId}/pay")
  public Mono<ResponseEntity<String>> payOrder(
      @PathVariable String orderId,
      @RequestParam Long amount) {

    return paymentClient.post()
        .uri("payments/pay")
        .bodyValue(new Request(orderId, amount))
        .retrieve()
        .bodyToMono(String.class)
        .timeout(Duration.ofMillis(paymentTimeoutMs))
        .retryWhen(retrySpec.withRetryContext(Context.of("orderId", orderId)))
        .map(msg -> ResponseEntity.ok("Order " + orderId + " -> " + msg))
        .onErrorResume(throwable -> {
          String fallback = "Payment queued for later processing. Reason: %s".formatted(throwable.getCause());
          return Mono.just(ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(fallback));
        });
  }

  private boolean isTransient(Throwable thr) {
    if (thr instanceof WebClientResponseException exception) {
      return exception.getStatusCode().is5xxServerError();
    }
    return thr instanceof ConnectException
        || thr instanceof IOException
        || thr instanceof TimeoutException;
  }

}
