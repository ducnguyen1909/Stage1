package com.tma.project.service;

import java.util.List;

import com.tma.project.entities.Time;

public interface TimeService {
	List<Time> getAllTime();
	
	void saveTime(Time time);
}
