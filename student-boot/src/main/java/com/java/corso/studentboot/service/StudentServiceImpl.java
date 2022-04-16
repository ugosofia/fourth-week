package com.java.corso.studentboot.service;

import com.java.corso.studentboot.domain.Student;
import com.java.corso.studentboot.repository.StudentRepository;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void update(DBCollection collection) {
        BasicDBObject dbObject = new BasicDBObject();
        dbObject.append("$set", new BasicDBObject().append("nome", "Pippo"));

        BasicDBObject searchQuery = new BasicDBObject().append("cognome", "pippo2");
        collection.update(searchQuery, dbObject);
    }


}
