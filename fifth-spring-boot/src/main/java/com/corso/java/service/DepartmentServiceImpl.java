package com.corso.java.service;

import com.corso.java.domain.Department;
import com.corso.java.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepository departmentRepository;


    @Override
    public Optional<Department> findById(String id) {
        return departmentRepository.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        departmentRepository.deleteById(id);

    }

    @Override
    public List<Department> findByIdAndName(String id, String name) {
        return departmentRepository.findByIdAnName(id, name);
    }

    @Override
    public List<Department> findByCity(String city) {
        return departmentRepository.findByCity(city);
    }
}
