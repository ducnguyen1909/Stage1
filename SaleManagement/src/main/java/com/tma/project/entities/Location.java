package com.tma.project.entities;
// Generated Oct 4, 2017 3:18:35 PM by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * Location generated by hbm2java
 */
@Entity
@Table(name = "location", schema = "public")
public class Location implements java.io.Serializable {
	
	private UUID locationId;
	private String country;
	private String city;
	private Set<Sales> saleses = new HashSet<Sales>(0);

	public Location() {
	}

	public Location(UUID locationId) {
		this.locationId = locationId;
	}

	public Location(UUID locationId, String country, String city, Set<Sales> saleses) {
		this.locationId = locationId;
		this.country = country;
		this.city = city;
		this.saleses = saleses;
	}

	@Id

	@Column(name = "location_id", unique = true, nullable = false)
	public UUID getLocationId() {
		return this.locationId;
	}

	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

	@Column(name = "country", length = 0)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "city", length = 0)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "location")
	public Set<Sales> getSaleses() {
		return this.saleses;
	}

	public void setSaleses(Set<Sales> saleses) {
		this.saleses = saleses;
	}

}
