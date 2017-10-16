package com.tma.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.project.entities.Sale;
import com.tma.project.entitiesDTO.SaleDTO;
import com.tma.project.exception.NoHandlerFoundException;
import com.tma.project.service.SaleService;

@RestController
@RequestMapping("sale")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<SaleDTO>> findAllSale(){
		List<Sale> lsSales = (List<Sale>) saleService.getAllSale();
		if(lsSales.size() == 0) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}
		List<SaleDTO> lstSalesDTO = new ArrayList<>();
		for (Sale sale : lsSales) {
			lstSalesDTO.add(new SaleDTO(sale));
		}
		return new ResponseEntity<>(lstSalesDTO,HttpStatus.OK);
	}
}
