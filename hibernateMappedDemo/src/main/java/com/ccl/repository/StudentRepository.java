package com.ccl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccl.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
