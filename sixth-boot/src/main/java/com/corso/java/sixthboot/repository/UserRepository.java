package com.corso.java.sixthboot.repository;

import com.corso.java.sixthboot.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findAll();
    void deleteById(String id);
    User getUserById(String id);
}
