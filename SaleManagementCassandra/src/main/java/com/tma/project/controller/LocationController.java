package com.tma.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.project.entities.Location;
import com.tma.project.entitiesDTO.LocationDTO;
import com.tma.project.exception.NoHandlerFoundException;
import com.tma.project.service.LocationService;

@RestController
@RequestMapping("location")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<LocationDTO>> getAllLocation()  {
		List<Location> lstLocation = (List<Location>) locationService.getAllLocation();
        if(lstLocation.size() == 0) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}
		List<LocationDTO> lstLocationDTO = new ArrayList<>();
		for (Location location : lstLocation) {
			lstLocationDTO.add(new LocationDTO(location));
		}
		return new ResponseEntity<>(lstLocationDTO,HttpStatus.OK);
	}
}
