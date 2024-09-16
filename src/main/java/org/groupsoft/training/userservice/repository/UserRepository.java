package org.groupsoft.training.userservice.repository;

import java.util.UUID;

import org.groupsoft.training.userservice.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
	UserEntity findByUsername(String username);
}
