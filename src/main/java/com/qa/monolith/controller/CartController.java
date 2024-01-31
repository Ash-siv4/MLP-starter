package com.qa.monolith.controller;

import com.qa.monolith.model.CartItem;
import com.qa.monolith.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired(required = true)
	private CartService cartService;

	@GetMapping
	public List<CartItem> getCartItems() {
		return cartService.getCartItems();
	}
}