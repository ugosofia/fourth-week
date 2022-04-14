package com.corso.java.bootjpa.repository;
import com.corso.java.domain.AppUser;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository extends MongoRepository<AppUser,String> {
    Optional<AppUser> findByEmail(String email);
}
