package com.corso.java.repository;

import com.corso.java.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    @Query(value = "SELECT d FROM department d WHERE d.id = ?1 AND d.name = ?2")
    List<Department> findByIdAnName(String id, String name);

    @Query(value = "SELECT d FROM department d WHERE d.city = ?1")
    List<Department> findByCity(String city);
}
