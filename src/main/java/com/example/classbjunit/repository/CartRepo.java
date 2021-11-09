package com.example.classbjunit.repository;

import com.example.classbjunit.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Long> {

}
