package com.tma.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.project.entities.Product;
import com.tma.project.repository.ProductRepository;
import com.tma.project.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepostory;
	
	@Override
	public void saveProduct(Product product) {
		productRepostory.save(product);
	}

	@Override
	public List<Product> findAllProduct() {
		return productRepostory.findAll();
	}

}
