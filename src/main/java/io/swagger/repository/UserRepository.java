package io.swagger.repository;

import io.swagger.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

//UserRepository is interface that allows connection with mongoDB
public interface UserRepository extends MongoRepository<User, String> {
        // MongoRepository has already implemented CRUD method
}
