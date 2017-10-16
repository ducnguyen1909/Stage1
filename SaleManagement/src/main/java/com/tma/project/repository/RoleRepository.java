package com.tma.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.project.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	Role findByroleNameContaining(String r);
}
