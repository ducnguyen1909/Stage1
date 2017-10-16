package com.tma.project.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tma.project.entities.Time;

public interface TimeRepository extends CrudRepository<Time, UUID>{

}
