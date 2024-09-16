package org.groupsoft.training.userservice.service;

import java.util.Optional;

import org.groupsoft.training.userservice.model.entity.Role;
import org.groupsoft.training.userservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Optional<Role> findRoleByName(String name) {
		return roleRepository.findByName(name);
	}
}
