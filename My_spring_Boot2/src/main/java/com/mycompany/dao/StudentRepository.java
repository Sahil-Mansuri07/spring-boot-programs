package com.mycompany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
