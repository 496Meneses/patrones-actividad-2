package com.example.payment;


import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/payments")
public class PaymentController {

  @Value("${chaos.enabled}")
  private boolean chaosEnabled;

  @Value("${chaos.failureRate}")
  private double failureRate;

  @Value("${chaos.maxLatencyMs}")
  private long maxLatencyMs;

  public record Request(String orderId, Long amount) {

  }

  @PostMapping("/pay")
  public Mono<String> pay(@RequestBody Request request) {

    long delay = chaosEnabled ? randomLatency(maxLatencyMs) : 0;

    log.info("Request received for order {} (amount={}, with scheduled delay {}ms", request.orderId, request.amount,
        delay);

    return Mono.delay(Duration.ofMillis(delay))
        .then(
            Mono.fromSupplier(() -> {
              if (chaosEnabled && randomFail(failureRate)) {
                log.warn("Chaos failure injected for order {} (amount={})", request.orderId, request.amount);
                throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Simulated failure for order %s".formatted(request.orderId)
                );
              }
              String response = "Payment approved for order %s (amount=%d), delay=%dms"
                  .formatted(request.orderId, request.amount, delay);
              log.info(response);
              return response;
            })
        );
  }

  private boolean randomFail(double rate) {
    return ThreadLocalRandom.current().nextDouble() < rate;
  }

  private long randomLatency(long maxMs) {
    return maxMs <= 0 ? 0 : ThreadLocalRandom.current().nextLong(0, maxMs + 1);
  }

}

