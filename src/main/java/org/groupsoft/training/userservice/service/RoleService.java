package org.groupsoft.training.userservice.service;

import java.util.Optional;

import org.groupsoft.training.userservice.model.entity.Role;

public interface RoleService {

	Role saveRole(Role role);

	Optional<Role> findRoleByName(String name);
}
