package com.tma.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tma.project.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByusernameContaining(String s);
}
