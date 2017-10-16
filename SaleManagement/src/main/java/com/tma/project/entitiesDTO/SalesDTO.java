package com.tma.project.entitiesDTO;

import java.math.BigDecimal;
import java.util.UUID;

import org.hibernate.annotations.Type;
import org.postgresql.util.PGmoney;

import com.tma.project.entities.Sales;

public class SalesDTO {

	private UUID productId;
	private UUID locationId;
	private UUID timeId;
	private BigDecimal dollars;
	public SalesDTO(Sales sales) {
		this.productId = sales.getProduct().getProductId();
		this.locationId = sales.getLocation().getLocationId();
		this.timeId = sales.getTime().getTimeId();
		this.dollars = BigDecimal.valueOf(sales.getDollars().val);
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
