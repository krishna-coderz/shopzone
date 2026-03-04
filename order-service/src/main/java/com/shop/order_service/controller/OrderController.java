
package com.shop.order_service.controller;
import com.shop.order_service.model.Order;
import com.shop.order_service.repository.OrderRepository;
import com.shop.order_service.service.OrderProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
 private final OrderRepository repo;
 private final OrderProducer producer;
 @PostMapping
 public Order create(@RequestBody Order order){
  order.status="CREATED";
  Order saved = repo.save(order);
  producer.send("ORDER_CREATED");
  return saved;
 }
}
