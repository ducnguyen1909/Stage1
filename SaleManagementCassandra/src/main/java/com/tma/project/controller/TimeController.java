package com.tma.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tma.project.entities.Time;
import com.tma.project.entitiesDTO.TimeDTO;
import com.tma.project.exception.NoHandlerFoundException;
import com.tma.project.service.TimeService;

@RestController
@RequestMapping("time")
public class TimeController {

	@Autowired
	private TimeService timeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<TimeDTO>> getTimes(){
		List<Time> lsTimes = (List<Time>) timeService.getAllTime();
		if(lsTimes.size() == 0) {
			throw new NoHandlerFoundException("NOT FOUND DATA");
		}
		List<TimeDTO> lsTimeDTO = new ArrayList<>();
		for (Time time : lsTimes) {
			lsTimeDTO.add(new TimeDTO(time));
		}
		return new ResponseEntity<>(lsTimeDTO,HttpStatus.OK);
	}
	

}
