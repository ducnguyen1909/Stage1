package com.tma.project.entities;
// Generated Oct 4, 2017 3:18:35 PM by Hibernate Tools 5.2.5.Final

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.postgresql.util.PGmoney;

/**
 * Sales generated by hbm2java
 */
@Entity
@Table(name = "sale", schema = "public")
public class Sales implements java.io.Serializable {

	private SalesId id;
	private Location location;
	private Product product;
	private Time time;
	private PGmoney dollars;

	public Sales() {
	}

	public Sales(SalesId id, PGmoney dollars) {
		this.id = id;
		this.dollars = dollars;
	}

	public Sales(Location location, Product product, Time time, PGmoney dollars) {
		this.location = location;
		this.product = product;
		this.time = time;
		this.dollars = dollars;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "productId", column = @Column(name = "product_id", nullable = false)),
			@AttributeOverride(name = "timeId", column = @Column(name = "time_id", nullable = false)),
			@AttributeOverride(name = "locationId", column = @Column(name = "location_id", nullable = false)) })
	public SalesId getId() {
		return this.id;
	}

	public void setId(SalesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "location_id", nullable = false, insertable = false, updatable = false)
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false, insertable = false, updatable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "time_id", nullable = false, insertable = false, updatable = false)
	public Time getTime() {
		return this.time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Column(name = "dollars", precision = 8, scale = 0)
	public PGmoney getDollars() {
		return this.dollars;
	}

	public void setDollars(PGmoney dollars) {
		this.dollars = dollars;
	}

}