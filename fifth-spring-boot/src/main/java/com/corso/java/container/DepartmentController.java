package com.corso.java.container;

import com.corso.java.domain.Department;
import com.corso.java.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v2")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping(path="/idname")
    ResponseEntity<?> findByIdAnName(@PathVariable String id, @RequestParam String name) {
        List<Department> department = departmentService.findByIdAndName(id, name);
        return new ResponseEntity<>(departmentService.findByIdAndName(id,name), HttpStatus.OK);
    }

    @GetMapping(path="/")
    ResponseEntity<List<Department>> findAll() {
        return new ResponseEntity<>(departmentService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path="/city")
    ResponseEntity<?> findByICity(@PathVariable String city) {
        List<Department> department = departmentService.findByCity(city);
        return new ResponseEntity<>(departmentService.findByCity(city), HttpStatus.OK);
    }

    @DeleteMapping(path="/{id}")
    ResponseEntity<Void> deleteById(@PathVariable String id) {
        departmentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
