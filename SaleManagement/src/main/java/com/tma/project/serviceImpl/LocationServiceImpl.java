package com.tma.project.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.project.entities.Location;
import com.tma.project.repository.LocationRepository;
import com.tma.project.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public void saveLocation(Location location) {
		locationRepository.save(location);
		
	}

	@Override
	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}

	@Override
	public boolean checkLocation(UUID locationId) {
		return locationRepository.exists(locationId);
	}

}
