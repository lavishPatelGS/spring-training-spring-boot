package org.groupsoft.training.userservice.model.document;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection = "users")
@Data
public class UserDocument {

	@Id
	private UUID id;

	@Field("username")
	private String username;

	@Field("email")
	private String email;

	private String password;

	private String firstName;
	private String lastName;

	private String bio;
	private String profileImageUrl;

	@Field("created_at")
	private LocalDateTime createdAt = LocalDateTime.now();

	@Field("updated_at")
	private LocalDateTime updatedAt = LocalDateTime.now();
}
