package com.tma.project.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.project.entities.Location;

public interface LocationRepository extends JpaRepository<Location, UUID>{

}
