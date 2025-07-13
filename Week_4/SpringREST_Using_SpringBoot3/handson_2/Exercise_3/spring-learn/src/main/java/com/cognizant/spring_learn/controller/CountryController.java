package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RestController
public class CountryController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	
	@RequestMapping("/country")
	public Country getCountryIndia() {
		LOGGER.debug("Start: getCountryIndia()");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("in", Country.class);
		context.close();
		LOGGER.debug("End: getCountryIndia()");
		
		return country;
	}
}
