package com.cognizant.exercise_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Exercise3Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Exercise3Application.class);

	public static void main(String[] args) {
		Exercise3Application app = new Exercise3Application();
		app.displayDate();
	}
	
	public void displayDate() {
		LOGGER.info("START");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		
		try {
			Date parsedDate = format.parse("31/12/2018");
			LOGGER.debug("Parsed Date : {}", parsedDate);
		} catch(Exception e) {
			LOGGER.error("Error parsing date : {}", e.getMessage());
		}
		
		context.close();
		LOGGER.info("END");
	}

}
