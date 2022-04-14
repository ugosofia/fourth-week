package com.java.corso.studentboot.controller;

import com.java.corso.studentboot.domain.Student;
import com.java.corso.studentboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping(path = "/student")
    ResponseEntity<List<Student>> getAll() {
        List<Student> students = studentService.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping(path = "/student")
    ResponseEntity<Student> create(@RequestParam Student student) {
        Student student1 = studentService.create(student);
        return new ResponseEntity<>(student1, HttpStatus.OK);
    }
}
