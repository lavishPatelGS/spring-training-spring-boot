package org.groupsoft.training.userservice.service;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.groupsoft.training.userservice.dao.LoginDao;
import org.groupsoft.training.userservice.model.entity.Role;
import org.groupsoft.training.userservice.model.entity.UserEntity;
import org.groupsoft.training.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleService roleService;

	@Autowired
	private AuthenticationManager authenticationManager;

	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	@Transactional
	@Override
	public UserEntity createUser(UserEntity userEntity) {

		userEntity.setPassword(encoder.encode(userEntity.getPassword()));

		Role role = roleService.findRoleByName("USER").get();
		userEntity.setRoles(Set.of(role));

		UserEntity savedUser = userRepository.save(userEntity);
		return savedUser;
	}

	@Transactional
	@Override
	public UserEntity updateUser(UUID id, UserEntity userEntity) {
		if (userRepository.existsById(id)) {
			userEntity.setId(id);
			UserEntity updatedUser = userRepository.save(userEntity);

			return updatedUser;
		}
		return null;
	}

	@Override
	public List<UserEntity> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public String login(LoginDao loginDao) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(loginDao.getUsername(), loginDao.getPassword()));
		if (authentication.isAuthenticated()) {
			return JwtServiceImpl.createToken(loginDao.getUsername());
		}
		return "Invalid Login";
	}
}
