package com.cognizant.exercise_5.service;

import com.cognizant.exercise_5.Country;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CountryService {
	
	public Country getCountry(String code) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	    @SuppressWarnings("unchecked")
		List<Country> countries = (List<Country>) context.getBean("countryList");
	    Country result = countries.stream()
	        .filter(c -> c.getCode().equalsIgnoreCase(code))
	        .findFirst()
	        .orElse(null);
	    context.close();
	    return result;
	}
}
