package com.mycompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.entity.Student;
import com.mycompany.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/insert1")
	public String form()
	{
		
		return "insert";
		
	}

	
	@RequestMapping("/insert2")
	public String form2(@ModelAttribute Student student)
	{
		
		studentService.insert(student);
		
		return "insert2";
		
	}
	
	
	
	
}
