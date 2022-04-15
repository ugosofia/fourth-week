package com.corso.java.container;

import com.corso.java.domain.Student;
import com.corso.java.service.StudentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping(path="/{id}")
    ResponseEntity<?> findById(@PathVariable String id) {
        Optional<Student> student = studentService.findById(id);
        return new ResponseEntity<Student>(studentService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping(path="/")
    ResponseEntity<List<Student>> findAll() {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping (path="/{id}")
    ResponseEntity<Void> deleteById(@PathVariable String id) {
        studentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = "/count")
    ResponseEntity<Integer> count() {
        studentService.count();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

//findbyidandname
//findbypassport
//count
