package com.tma.project.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.project.entities.Product;
import com.tma.project.repository.ProductRepository;
import com.tma.project.service.ProductService;

@Service
public class UserServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Iterable<Product> findAllProduct() {
		return productRepository.findAll();
	}

}
