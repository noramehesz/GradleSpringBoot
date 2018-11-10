package com.example.gradle_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GradleDemoApplication {
	
	@RequestMapping("/")
	  public String home() {
	    return "Hello baba";
	  }

	public static void main(String[] args) {
		SpringApplication.run(GradleDemoApplication.class, args);
	}
}
