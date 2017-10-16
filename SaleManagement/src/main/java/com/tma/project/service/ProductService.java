package com.tma.project.service;

import java.util.List;

import com.tma.project.entities.Product;

public interface ProductService {
	void saveProduct(Product product);
	
	List<Product> findAllProduct();
}
