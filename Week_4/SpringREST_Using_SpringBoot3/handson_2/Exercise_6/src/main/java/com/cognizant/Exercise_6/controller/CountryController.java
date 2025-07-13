package com.cognizant.Exercise_6.controller;

import com.cognizant.Exercise_6.Country;
import com.cognizant.Exercise_6.service.CountryService;
import com.cognizant.Exercise_6.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
		return countryService.getCountry(code);
	}
	
}
