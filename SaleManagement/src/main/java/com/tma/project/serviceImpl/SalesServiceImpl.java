package com.tma.project.serviceImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import org.postgresql.util.PGmoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.project.entities.Sales;
import com.tma.project.repository.SaleRepository;
import com.tma.project.service.SaleService;

@Service
public class SalesServiceImpl implements SaleService{

	@Autowired
	private SaleRepository saleRepository;
	
	@Override
	public List<Sales> getSales() {
		return saleRepository.findAll();
	}

	@Override
	public void saveSale(Sales sales) {
		saleRepository.save(sales);
	}

	@Override
	public void addSales(UUID productId, UUID timeId, UUID locationId, BigDecimal dollars) {
		saleRepository.addSales(productId, timeId, locationId, dollars);
	}

}
