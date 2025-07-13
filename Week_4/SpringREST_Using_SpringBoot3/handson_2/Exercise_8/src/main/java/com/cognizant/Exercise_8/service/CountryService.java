package com.cognizant.Exercise_8.service;


import com.cognizant.Exercise_8.Country;
import com.cognizant.Exercise_8.service.exception.CountryNotFoundException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryService {
	
	@SuppressWarnings("unchecked")
	public Country getCountry(String code) throws CountryNotFoundException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		
		List<Country> countryList = context.getBean("countryList", List.class);
		context.close();
		
		// case insensitive match
		return countryList.stream()
				.filter(country -> country.getCode().equalsIgnoreCase(code))
				.findFirst()
				.orElseThrow(() -> new CountryNotFoundException("Country not found."));
	}
	
	public List<Country> getAllCountries() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		@SuppressWarnings("unchecked")
		List<Country> countryList = context.getBean("countryList", List.class);
		
		context.close();
		
		return countryList;
	}
}