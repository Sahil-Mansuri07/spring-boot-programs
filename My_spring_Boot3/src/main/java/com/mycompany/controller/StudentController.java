package com.mycompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.entity.Student;
import com.mycompany.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/get")
	public List<Student> getAll()
	{
		
		return studentService.getAll();
		
	}
	
	@GetMapping("/get/{roll}")
	public Student getStudent(@PathVariable Integer roll)
	{
		
		return studentService.getStudent(roll);
		
	}
	
	@PostMapping("/post")
	public Student postStudent(@RequestBody Student student) 
	{
	   
		return studentService.postStudent(student);
	
	}

	@PutMapping("/put")
	public Student putStudent(@RequestBody Student student)
	{
		
		return studentService.putStudent(student);
		
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteAll()
	{
		
	   studentService.deleteAll();
		
	}
	
	@DeleteMapping("/delete/{roll}")
	public void deleteStudent(@PathVariable Integer roll)
	{
		
		 studentService.deleteStudent(roll);
		
	}
	
}
