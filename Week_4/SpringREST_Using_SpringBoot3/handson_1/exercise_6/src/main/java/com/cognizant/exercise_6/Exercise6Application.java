package com.cognizant.exercise_6;

import com.cognizant.exercise_6.Country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Exercise6Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercise6Application.class, args);
		displayCountries();
	}
	
	public static void displayCountries() {
	    Logger LOGGER = LoggerFactory.getLogger(Exercise6Application.class);
	    LOGGER.info("START");

	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

	    @SuppressWarnings("unchecked")
		List<Country> countryList = context.getBean("countryList", ArrayList.class);
	    LOGGER.debug("Country List: {}", countryList);

	    context.close();
	    LOGGER.info("END");
	}


}
