for i in {1..5}; do
  curl -s -X POST "http://localhost:9082/orders/POC-$i/pay?amount=200" \
       -H "Content-Type: application/json"
  echo
done

