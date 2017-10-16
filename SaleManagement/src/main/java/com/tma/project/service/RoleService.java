package com.tma.project.service;

import com.tma.project.entities.Role;

public interface RoleService {

	void saveRole(Role role);
	
	Role findByName(String nameRole);
}
