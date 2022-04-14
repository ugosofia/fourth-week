package com.java.corso.studentboot.service;

import com.java.corso.studentboot.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student create(Student student);
}
