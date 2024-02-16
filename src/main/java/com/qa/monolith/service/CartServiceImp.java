package com.qa.monolith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.monolith.model.CartItem;
import com.qa.monolith.repository.CartRepository;

@Service
public class CartServiceImp implements CartService{
	
	@Autowired
	private CartRepository cRepo;

	@Override
	public List<CartItem> getCartItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addToCart(Long productId, int quantity) {
		// TODO Auto-generated method stub
		
	}

}
