package com.qa.monolith.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.monolith.model.CartItem;

@Repository
public interface CartRepository extends JpaRepository<CartItem, Long> {

}