package com.tma.project.serviceImpl;

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
	public Iterable<Location> getAllLocation() {
		return locationRepository.findAll();
	}
	

}
