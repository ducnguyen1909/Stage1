package com.tma.project.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.project.entities.Role;
import com.tma.project.repository.RoleRepository;
import com.tma.project.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void saveRole(Role role) {
		roleRepository.save(role);
	}

	@Override
	public Role findByName(String nameRole) {
		return roleRepository.findByroleNameContaining(nameRole);
	}

}
