package com.tma.project.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tma.project.entities.Product;

public interface ProductRepository extends CrudRepository<Product, UUID>{

}
