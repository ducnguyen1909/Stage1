package com.tma.project.service;

import com.tma.project.entities.User;

public interface UserService {

	void saveUser(User user);
	
	User findByUserName(String userName);
}
