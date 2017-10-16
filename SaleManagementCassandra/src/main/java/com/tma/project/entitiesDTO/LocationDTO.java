package com.tma.project.entitiesDTO;

import java.util.UUID;

import org.hibernate.annotations.Type;

import com.tma.project.entities.Location;

public class LocationDTO {
	private UUID locationId;
	private String country;
	private String city;
	
	
	public LocationDTO(Location location) {
		this.locationId = location.getLocationId();
		this.country = location.getCountry();
		this.city = location.getCity();
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
