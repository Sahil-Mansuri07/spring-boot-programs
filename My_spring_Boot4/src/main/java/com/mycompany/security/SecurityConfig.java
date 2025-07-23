package com.mycompany.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception
	{
		
		httpSecurity.csrf()
		.disable()
		.authorizeHttpRequests()
		.requestMatchers("/home/public")
		.permitAll()
		.anyRequest().
		authenticated()
		.and().
		formLogin();
		
	    return httpSecurity.build();
	
	}
	
}

 /*
 
  if you want a custom login page instead of the default login page then do this
  
 👉👉👉 formLogin().loginPage("/myLoginPage");
  
  */
