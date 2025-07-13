package com.cognizant.Exercise_8.controller;

import com.cognizant.Exercise_8.Country;
import com.cognizant.Exercise_8.service.CountryService;
import com.cognizant.Exercise_8.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/country/{code}")
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
		return countryService.getCountry(code);
	}
	
}