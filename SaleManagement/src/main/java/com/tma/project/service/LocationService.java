package com.tma.project.service;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.project.entities.Location;

public interface LocationService {
	void saveLocation(Location location);
	
	List<Location> getAllLocation();
	
	boolean checkLocation(UUID locationId);
}
