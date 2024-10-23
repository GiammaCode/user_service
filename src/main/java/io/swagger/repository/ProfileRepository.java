package io.swagger.repository;

import io.swagger.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends MongoRepository<Profile, String> {
    // Puoi aggiungere metodi personalizzati per le query, se necessario.
}
