package com.example.demoRailway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemoRailwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRailwayApplication.class, args);
	}

	@GetMapping("/")
    public String hello() {
      return String.format("Hello world from Java Spring Boot!");
    }
}
