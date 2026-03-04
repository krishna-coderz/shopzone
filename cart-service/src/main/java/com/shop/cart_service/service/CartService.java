package com.shop.cart_service.service;

import com.shop.cart_service.model.Cart;
import com.shop.cart_service.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepository repository;

    public Cart addToCart(Cart cart){

        return repository.save(cart);

    }

    public List<Cart> getCart(Long userId){

        return repository.findByUserId(userId);

    }

}
