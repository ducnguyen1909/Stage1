package com.tma.project.entities;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("location")
public class Location{

	@PrimaryKey("location_id")
	private UUID locationId;
	@Column("country")
	private String country;
	@Column("city")
	private String city;

	public Location(UUID locationId, String country, String city) {
		this.locationId = locationId;
		this.country = country;
		this.city = city;
	}

	public UUID getLocationId() {
		return locationId;
	}

	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
