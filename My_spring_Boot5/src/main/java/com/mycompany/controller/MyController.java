package com.mycompany.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class MyController {

	@GetMapping("/normalUser")
	public ResponseEntity<String> normalUser()
	{
		
		return ResponseEntity.ok("I am a Normal Userrrrrrrrrrr");
		
	}
	
	@GetMapping("/publicUser")
	public ResponseEntity<String> publicUser()
	{
		
		return ResponseEntity.ok("I am a Public Userrrrrr");
		
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> admin()
	{
		
		return ResponseEntity.ok("I am a Adminnnnnnnnnnnnn");
		
	}
	
	
}
