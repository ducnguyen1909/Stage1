package com.tma.project.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.postgresql.util.PGmoney;

import com.tma.project.entities.Sales;


public interface SaleService {

	List<Sales> getSales();
	
	void saveSale(Sales sales);
	
	void addSales(UUID productId, UUID timeId,UUID locationId, BigDecimal dollars);
}
