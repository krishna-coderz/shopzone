package com.shop.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shop.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
