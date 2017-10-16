package com.tma.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.tma.project.entities.Sale;
import com.tma.project.entities.SaleId;

public interface SaleRepository extends CrudRepository<Sale, SaleId>{

}
