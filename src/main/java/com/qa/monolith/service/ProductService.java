package com.qa.monolith.service;

import com.qa.monolith.model.Product;

import java.util.List;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProductById(Long id);

}