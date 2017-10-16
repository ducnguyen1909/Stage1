package com.tma.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
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
    private static Logger logger = (Logger) LogManager.getLogger(LocationController.class);

	@Autowired
	private LocationService locationService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Location> addLocation(@RequestBody Location location) {
		UUID uuid = UUID.randomUUID();
		location.setLocationId(uuid);
		locationService.saveLocation(location);
		return new ResponseEntity<Location>(HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<LocationDTO>> getAllLocation() throws NoHandlerFoundException {
		List<Location> lstLocation = null;
		lstLocation = locationService.getAllLocation();
//		logger.debug("Debug message");
//        logger.info("Info message");
//        logger.warn("Warn message");
//        logger.error("Error message");
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
