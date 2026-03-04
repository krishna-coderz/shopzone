
package com.shop.order_service.service;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class OrderProducer {
 private final KafkaTemplate<String,String> kafkaTemplate;
 public void send(String msg){
  kafkaTemplate.send("order-topic",msg);
 }
}
