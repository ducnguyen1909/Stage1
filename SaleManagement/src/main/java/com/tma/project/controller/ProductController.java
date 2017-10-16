package com.tma.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveProduct(@RequestBody Product product) {
		UUID uuid = UUID.randomUUID();
		product.setProductId(uuid);
		productService.saveProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ProductDTO> getAllProducts() {
		List<Product> lstProduct = productService.findAllProduct();
		if(lstProduct == null) {
			throw new NoHandlerFoundException("NOT FOUND");
		}
		List<ProductDTO> lstProductDTO = new ArrayList<>();
		for (Product product : lstProduct) {
			lstProductDTO.add(new ProductDTO(product));
		}
		return lstProductDTO;
	}
}
