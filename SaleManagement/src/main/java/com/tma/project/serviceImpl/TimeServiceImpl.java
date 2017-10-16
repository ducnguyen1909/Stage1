package com.tma.project.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.project.entities.Time;
import com.tma.project.repository.TimeRepository;
import com.tma.project.service.TimeService;

@Service
public class TimeServiceImpl implements TimeService{

	@Autowired
	private TimeRepository timeRepository;
	
	@Override
	public List<Time> getAllTime() {
		return timeRepository.findAll();
	}

	@Override
	public void saveTime(Time time) {
		timeRepository.save(time);
	}

}
