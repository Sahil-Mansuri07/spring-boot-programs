package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mycompany.entity.Student;
import com.mycompany.service.StudentService;

@SpringBootApplication
public class MySpringBoot1Application {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context=SpringApplication.run(MySpringBoot1Application.class, args);
	
	StudentService studentService=context.getBean(StudentService.class);
	
	Student student=new Student();
	
	student.setRoll(15);
	student.setName("John Wick");
	student.setPercent(53.4);
	
	Student student1=studentService.insert(student);
	
	if(student1!=null)
	{
		System.out.println("👉👉👉👉🤣🤣🤣👌👌👌");
		
		
		System.out.println("Data inserted of roll no=>" +student1);
		
		System.out.println("👉👉👉👉🤣🤣🤣👌👌👌");
		
		
	}
	
	else
	{
		System.out.println("Data not inserted");
		
	}	
	  context.close();
	
	}

}
