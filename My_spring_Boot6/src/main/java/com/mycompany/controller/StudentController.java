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
@RequestMapping("/studentHome")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/getAll")
	public List<Student> getAll()
	{
		return studentService.getAll();
		
	}
	
	
	@GetMapping("/getByRoll/{roll}")
	public Student getStudentById(@PathVariable Integer roll)
	{
		return studentService.getStudentById(roll);
		
	}
	
	@GetMapping("/getByName/{name}")
	public List<Student> getStudentByName(@PathVariable String name)
	{
		return studentService.getStudentByName(name);
		
	}
	
	@PostMapping("/postStudents")
	public List<Student> postStudent(@RequestBody List<Student> student)
	{
		return studentService.postStudent(student);
		
	}
	
	@PutMapping("/putStudents")
	public List<Student> putStudent(@RequestBody List<Student> student)
	{
		return studentService.putStudent(student);
		
	}
	
	@DeleteMapping("/deleteStudent/{roll}")
	public void deleteStudent(@PathVariable List<Integer> roll)
	{
		 studentService.deleteStudent(roll);
		
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteAll()
	{
		studentService.deleteAll();
		
	}
	
}
