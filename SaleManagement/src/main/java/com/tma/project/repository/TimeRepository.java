package com.tma.project.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.project.entities.Time;

public interface TimeRepository extends JpaRepository<Time, UUID>{

}
