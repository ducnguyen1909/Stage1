package com.tma.project.entities;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("product")
public class Product{

	@PrimaryKey("product_id")
	private UUID productId;
	@Column("item")
	private Integer item;
	@Column("class")
	private String class_;
	@Column("inventory")
	private String inventory;

	public Product(UUID productId, Integer item, String class_, String inventory) {
		this.productId = productId;
		this.item = item;
		this.class_ = class_;
		this.inventory = inventory;
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
