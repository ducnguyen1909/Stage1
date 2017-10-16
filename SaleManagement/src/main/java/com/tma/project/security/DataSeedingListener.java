package com.tma.project.security;

import java.util.Date;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.tma.project.entities.Role;
import com.tma.project.entities.User;
import com.tma.project.service.RoleService;
import com.tma.project.service.UserService;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	 private UserService userService;
	 
	 @Autowired
	 private RoleService roleService;
	 
	 @Autowired 
	 private PasswordEncoder passwordEncoder;
	 
	 @Override
	 public void onApplicationEvent(ContextRefreshedEvent arg0) {
	  // Roles
	  if (roleService.findByName("ROLE_ADMIN") == null) {
		  roleService.saveRole(new Role(1, "ROLE_ADMIN", new Date()));
	  }
	  
	  if (roleService.findByName("ROLE_MEMBER") == null) {
		  roleService.saveRole(new Role(2, "ROLE_ADMIN", new Date()));
	  }
	  
	  // Admin account
	  if (userService.findByUserName("admin") == null) {
	   User admin = new User();
	   admin.setUserId(1);
	   admin.setName("admin");
	   admin.setUsername("admin");
	   admin.setPassword(passwordEncoder.encode("123456"));
	   HashSet<Role> roles = new HashSet<>();
	   roles.add(roleService.findByName("ROLE_ADMIN"));
	   roles.add(roleService.findByName("ROLE_MEMBER"));
	   admin.setRoles(roles);
	   userService.saveUser(admin);
	  }
	  
	  // Member account
	  if (userService.findByUserName("member") == null) {
	   User user = new User();
	   user.setUserId(2);
	   user.setName("member");
	   user.setPassword(passwordEncoder.encode("12345"));
	   HashSet<Role> roles = new HashSet<>();
	   roles.add(roleService.findByName("ROLE_MEMBER"));
	   user.setRoles(roles);
	   userService.saveUser(user);
	  }
	 }

}
