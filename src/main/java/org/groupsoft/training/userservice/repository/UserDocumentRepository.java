package org.groupsoft.training.userservice.repository;

import java.util.UUID;

import org.groupsoft.training.userservice.model.document.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDocumentRepository extends MongoRepository<UserDocument, UUID> {
	// Custom queries if needed
}
