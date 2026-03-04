
package com.shop.notification_service.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class NotificationConsumer {
 @KafkaListener(topics="order-topic",groupId="notification-group")
 public void listen(String msg){
  System.out.println("Notification sent for event: "+msg);
 }
}
