
package com.shop.order_service.model;
import jakarta.persistence.*;
@Entity
public class Order {
 @Id @GeneratedValue
 public Long id;
 public Long userId;
 public double total;
 public String status;
}
