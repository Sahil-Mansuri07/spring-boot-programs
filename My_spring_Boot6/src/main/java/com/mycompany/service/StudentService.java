package com.mycompany.service;

import java.util.ArrayList;
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
		
		return studentRepository.findAll();
		
	}
	
	public Student getStudentById(Integer roll)
	{
		
		Optional<Student> optional=studentRepository.findById(roll);
	
		Student student=optional.get();
		
		return student;
		
	}
	
	
	public List<Student> getStudentByName(String name)
	{
		
		return studentRepository.findByName(name);
		
	}
	
	
	public List<Student> postStudent(List<Student> students)
	{
		
		return studentRepository.saveAll(students);
		
	}
	
	public List<Student> putStudent(List<Student> students)
	{
		List<Student> updatedStudents = new ArrayList<>();

		for (Student student : students)
		{
			Optional<Student> optional = studentRepository.findById(student.getRoll());

			Student student1 = optional.get();

			student1.setName(student.getName());

			student1.setPercent(student.getPercent());

			updatedStudents.add(student1);
		}

		return studentRepository.saveAll(updatedStudents);
	}

	
	public void deleteStudent(List<Integer> roll)
	{
		
		 studentRepository.deleteAllById(roll);
		
	}
	
	public void deleteAll()
	{
		
		studentRepository.deleteAll();
		
	}
	
	
}
