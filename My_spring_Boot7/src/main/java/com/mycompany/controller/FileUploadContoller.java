package com.mycompany.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/myFiles")
public class FileUploadContoller {


    private static final String UPLOAD_DIR = System.getProperty("user.home") + File.separator + "uploads";

    
    @PostMapping(path="/upload",consumes="multipart/form-data")
    public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile file)
    {
    	
    try {
    	
    	Files.createDirectories(Paths.get(UPLOAD_DIR));
    		
    	Path filePath=Paths.get(UPLOAD_DIR,file.getOriginalFilename());
    		
    	file.transferTo(filePath.toFile());
    	
    	System.out.println("Path is=>" +filePath);
    	
    	return ResponseEntity.ok("File uploaded successfully "+filePath.getFileName());
    	
    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		
    		return ResponseEntity.status(500).body("File upload failed");
    		
    	}
    	
    }
	
	@GetMapping("/form")
    public String form()
    {
    	
    	return "form";
    	
    }
	
	
}
