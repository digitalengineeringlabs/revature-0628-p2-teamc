package com.project2.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Project2 {

	private static final Logger logger=LoggerFactory.getLogger(Project2.class);
	public static void main(String[] args) {
		SpringApplication.run(Project2.class, args);
		
		logger.info("Starting up the servlet");
	}

}
