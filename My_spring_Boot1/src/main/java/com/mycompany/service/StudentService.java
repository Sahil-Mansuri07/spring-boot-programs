package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.dao.StudentRepository;
import com.mycompany.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student insert(Student student)
	{
	
	Student student1=(Student)studentRepository.save(student);
		
	return student1;
	
	}
	
}
