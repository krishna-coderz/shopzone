
package com.shop.payment_service.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class PaymentConsumer {
 @KafkaListener(topics="order-topic",groupId="payment-group")
 public void listen(String msg){
  System.out.println("Payment processing for event: "+msg);
 }
}
