package com.cognizant.Exercise_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:employee.xml")
public class Exercise2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercise2Application.class, args);
	}

}
