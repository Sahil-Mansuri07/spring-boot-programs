package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.dao.StudentRepository;
import com.mycompany.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	
	public List<Student> getAll()
	{
		
	  List<Student> list=studentRepository.findAll();
		
		return list;
	  
	}
	
	public Student getStudent(Integer roll)
	{
		
		Optional<Student> optional= studentRepository.findById(roll);
		
		Student student=optional.get();
		
		return student;
		
	}
	
	public Student postStudent(Student student)
	{
			return studentRepository.save(student);
	}
	
	public Student putStudent(Student student)
	{
		
	Optional<Student> optional=studentRepository.findById(student.getRoll());
	
	Student student1=optional.get();
	
	student1.setRoll(student.getRoll());
	
	studentRepository.save(student1);
	
	return student1;
		
	}
	
	public void deleteStudent(Integer roll)
	{
		
		 studentRepository.deleteById(roll);
		
	}
	
	public void deleteAll()
	{
		
		studentRepository.deleteAll();
		
	}
	
	
  }
