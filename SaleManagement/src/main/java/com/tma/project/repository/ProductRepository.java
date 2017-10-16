package com.tma.project.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, UUID>{

	
}
