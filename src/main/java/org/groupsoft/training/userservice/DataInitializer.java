package org.groupsoft.training.userservice;

import org.groupsoft.training.userservice.model.entity.Role;
import org.groupsoft.training.userservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements ApplicationRunner {

	@Autowired
	private RoleService roleService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		if (roleService.findRoleByName("USER").isEmpty()) {
			Role userRole = new Role();
			userRole.setName("USER");
			roleService.saveRole(userRole);
		}

		if (roleService.findRoleByName("ADMIN").isEmpty()) {
			Role adminRole = new Role();
			adminRole.setName("ADMIN");
			roleService.saveRole(adminRole);
		}
	}
}