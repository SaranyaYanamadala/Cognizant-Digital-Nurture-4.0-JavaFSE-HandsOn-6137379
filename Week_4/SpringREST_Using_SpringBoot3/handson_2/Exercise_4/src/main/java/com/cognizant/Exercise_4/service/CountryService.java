package com.cognizant.Exercise_4.service;


import com.cognizant.Exercise_4.Country;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryService {
	
	public List<Country> getAllCountries() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		@SuppressWarnings("unchecked")
		List<Country> countryList = context.getBean("countryList", List.class);
		
		context.close();
		
		return countryList;
	}
}
