package com.cognizant.exercise_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
public class Exercise2Application {

	public static void main(String[] args) {
		Exercise2Application app = new Exercise2Application();
		app.displayDate();
	}
	
	public void displayDate() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		
		try {
			Date parsedDate = format.parse("31/12/2018");
			System.out.println("Parsed Date : " + parsedDate);
		} catch(Exception e) {
			System.err.println("Error parsing date : " + e.getMessage());
		}
		
		context.close();
	}
	
	

}
