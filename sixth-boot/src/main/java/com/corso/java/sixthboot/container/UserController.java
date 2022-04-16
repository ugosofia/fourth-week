package com.corso.java.sixthboot.container;

import com.corso.java.sixthboot.domain.User;
import com.corso.java.sixthboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1")
public class UserController {

        @Autowired
        UserRepository userRepository;


        @GetMapping(path = "/{id}")
        public ResponseEntity<User> getUserById(@PathVariable String id) {
                return new ResponseEntity(userRepository.getUserById(id), HttpStatus.OK);
        }


        @GetMapping()
        public ResponseEntity<User> findAll() {
                return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
        }

        @DeleteMapping(path="/{id}")
        ResponseEntity<Void> deleteById(@PathVariable String id) {
                userRepository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.OK);
        }

        @PostMapping()
        public ResponseEntity<String> insertUser() {
         return new ResponseEntity<>()  ;
        }

        @PutMapping()
        public ResponseEntity<String> put() {

        }
}
