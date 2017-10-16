package com.tma.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.project.entities.Sale;
import com.tma.project.repository.SaleRepository;
import com.tma.project.service.SaleService;

@Service
public class SaleServiceImpl implements SaleService{

	@Autowired
	private SaleRepository saleRepository;
	
	@Override
	public Iterable<Sale> getAllSale() {
		return saleRepository.findAll();
	}

}
