package com.tma.project.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.project.entities.Product;
import com.tma.project.entitiesDTO.ProductDTO;
import com.tma.project.exception.NoHandlerFoundException;
import com.tma.project.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ProductDTO>> getAllProducts() {
		List<Product> lstProduct = (List<Product>) productService.findAllProduct();
		if(lstProduct.size() == 0) {
			throw new NoHandlerFoundException("NOT FOUND");
		}
		List<ProductDTO> lstProductDTO = new ArrayList<>();
		for (Product product : lstProduct) {
			lstProductDTO.add(new ProductDTO(product));
		}
		return new ResponseEntity<>(lstProductDTO, HttpStatus.OK);
	}
}
