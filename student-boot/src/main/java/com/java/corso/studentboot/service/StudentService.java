package com.java.corso.studentboot.service;

import com.java.corso.studentboot.domain.Student;

import java.util.List;
import com.mongodb.DBCollection;

public interface StudentService {

    List<Student> findAll();
    Student create(Student student);
    void update(DBCollection dbCollection);
}
