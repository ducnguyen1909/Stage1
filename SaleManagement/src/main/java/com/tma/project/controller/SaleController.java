package com.tma.project.controller;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.postgresql.util.PGmoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.number.money.MonetaryAmountFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.project.entities.Location;
import com.tma.project.entities.Product;
import com.tma.project.entities.Sales;
import com.tma.project.entities.Time;
import com.tma.project.entitiesDTO.SalesDTO;
import com.tma.project.exception.NoHandlerFoundException;
import com.tma.project.service.SaleService;


@RestController
@RequestMapping("sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Sales> addTime(@RequestBody Sales sales ){
		saleService.addSales(sales.getProduct().getProductId(), sales.getTime().getTimeId(), sales.getLocation().getLocationId(),BigDecimal.valueOf(sales.getDollars().val));
		return new ResponseEntity<Sales>(sales, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<SalesDTO> getAllProducts() {
		List<Sales> lstSales = saleService.getSales();
		if(lstSales.size() == 0) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}
		List<SalesDTO> lstSalesDTO = new ArrayList<>();
		for (Sales sales : lstSales) {
			lstSalesDTO.add(new SalesDTO(sales));
		}
		return lstSalesDTO;
	}
}
