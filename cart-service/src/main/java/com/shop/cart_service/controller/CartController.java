package com.shop.cart_service.controller;

import com.shop.cart_service.model.Cart;
import com.shop.cart_service.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService service;

    @PostMapping
    public Cart add(@RequestBody Cart cart){

        return service.addToCart(cart);

    }

    @GetMapping("/{userId}")
    public List<Cart> getCart(@PathVariable Long userId){

        return service.getCart(userId);

    }

}
