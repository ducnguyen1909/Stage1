package com.tma.project.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tma.project.entities.Location;

public interface LocationRepository extends CrudRepository<Location, UUID> {

}
