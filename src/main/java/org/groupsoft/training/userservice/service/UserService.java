package org.groupsoft.training.userservice.service;

import java.util.List;
import java.util.UUID;

import org.groupsoft.training.userservice.dao.LoginDao;
import org.groupsoft.training.userservice.model.entity.UserEntity;

public interface UserService {
	UserEntity createUser(UserEntity userEntity);

	List<UserEntity> getUsers();

	UserEntity updateUser(UUID id, UserEntity userEntity);

	String login(LoginDao loginDao);
}
