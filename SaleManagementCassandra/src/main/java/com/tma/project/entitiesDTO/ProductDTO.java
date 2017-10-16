package com.tma.project.entitiesDTO;

import java.util.UUID;

import org.hibernate.annotations.Type;

import com.tma.project.entities.Product;

public class ProductDTO {
	
	private UUID productId;
	private Integer item;
	private String class_;
	private String inventory;
	public ProductDTO(Product product) {
		this.productId = product.getProductId();
		this.item = product.getItem();
		this.class_ = product.getClass_();
		this.inventory = product.getInventory();
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	public Integer getItem() {
		return item;
	}
	public void setItem(Integer item) {
		this.item = item;
	}
	public String getClass_() {
		return class_;
	}
	public void setClass_(String class_) {
		this.class_ = class_;
	}
	public String getInventory() {
		return inventory;
	}
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}
	
	
}
