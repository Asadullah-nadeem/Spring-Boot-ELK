package org.example.springboot_elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootElkApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootElkApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElkApplication.class, args);
	}
	@GetMapping("/")
	public String hello() {
		logger.info("Hello endpoint called");
		return "Hello from Spring Boot ELK Demo!";
	}

	@GetMapping("/error-test")
	public String error() {
		logger.error("This is a simulated error!");
		return "Error simulated";
	}
}
