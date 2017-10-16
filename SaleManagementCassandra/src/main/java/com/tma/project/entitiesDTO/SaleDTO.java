package com.tma.project.entitiesDTO;

import java.math.BigDecimal;
import java.util.UUID;

import org.hibernate.annotations.Type;

import com.tma.project.entities.Sale;

public class SaleDTO {

	private UUID productId;
	private UUID locationId;
	private UUID timeId;
	private BigDecimal dollars;
	public SaleDTO(Sale sales) {
		this.productId = sales.getProductId();
		this.locationId = sales.getLocationId();
		this.timeId = sales.getTimeId();
		this.dollars = sales.getDollars();
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	public UUID getLocationId() {
		return locationId;
	}
	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}
	public UUID getTimeId() {
		return timeId;
	}
	public void setTimeId(UUID timeId) {
		this.timeId = timeId;
	}
	public BigDecimal getDollars() {
		return dollars;
	}
	public void setDollars(BigDecimal dollars) {
		this.dollars = dollars;
	}
	
	
}
