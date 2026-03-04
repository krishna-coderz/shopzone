
package com.shop.inventory_service.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class InventoryConsumer {
 @KafkaListener(topics="order-topic",groupId="inventory-group")
 public void listen(String msg){
  System.out.println("Inventory update for event: "+msg);
 }
}
