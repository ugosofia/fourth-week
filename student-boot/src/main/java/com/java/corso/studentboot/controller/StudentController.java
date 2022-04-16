package com.java.corso.studentboot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.corso.studentboot.domain.Student;
import com.java.corso.studentboot.service.StudentService;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;
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

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@PathVariable("id") String id) throws UnknownHostException {
        String studentId = id;
        Mongo mongo = new Mongo("localhost", 27017);
        DB db = mongo.getDB("corso");
        DBCollection dbCollection = db.getCollection("Student");

        studentService.update(dbCollection);
        return ResponseEntity.ok(HttpStatus.OK);

    }
}