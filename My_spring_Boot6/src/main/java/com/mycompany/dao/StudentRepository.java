package com.mycompany.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public List<Student> findByName(String name); 
	
}
