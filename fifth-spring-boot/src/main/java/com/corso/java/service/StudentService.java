package com.corso.java.service;

import com.corso.java.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface StudentService {

    Optional<Student> findById(String id);
    List<Student> findAll();
    void deleteById(String id);
    long count();
}
