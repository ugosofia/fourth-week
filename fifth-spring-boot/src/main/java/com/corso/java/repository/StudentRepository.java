package com.corso.java.repository;

import com.corso.java.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    @Query(countQuery = "SELECT count(*) FROM students",
    nativeQuery = true)
    long count();

    @Query(value = "SELECT s FROM students s WHERE s.id = ?1", nativeQuery = true)
    Optional<Student> findById(String id);

}
