package com.qa.monolith.service;

import com.qa.monolith.model.CartItem;

import java.util.List;

public interface CartService {

	List<CartItem> getCartItems();

	void addToCart(Long productId, int quantity);

}