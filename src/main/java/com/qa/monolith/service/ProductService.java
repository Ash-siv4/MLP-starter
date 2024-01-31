package com.qa.monolith.service;

import com.qa.monolith.model.Product;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {

	List<Product> getAllProducts();

	Product getProductById(Long id);

}