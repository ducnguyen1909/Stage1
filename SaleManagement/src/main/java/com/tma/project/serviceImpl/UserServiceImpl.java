package com.tma.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.project.entities.User;
import com.tma.project.repository.UserRepository;
import com.tma.project.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByusernameContaining(userName);
	}

}
