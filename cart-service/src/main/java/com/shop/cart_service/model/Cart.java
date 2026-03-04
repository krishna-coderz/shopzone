package com.shop.cart_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cart {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private Long productId;

    private int quantity;

}
