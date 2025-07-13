package com.cognizant.Exercise_4.controller;

import com.cognizant.Exercise_4.Country;
import com.cognizant.Exercise_4.service.CountryService;
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
	
}
