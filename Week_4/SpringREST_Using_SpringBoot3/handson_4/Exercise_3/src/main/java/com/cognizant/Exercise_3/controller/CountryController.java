package com.cognizant.Exercise_3.controller;

import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import com.cognizant.Exercise_3.model.Country;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CountryController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

	

	@PostMapping("/countries")
	public Country addCountry(@RequestBody Country country) {
		
	    LOGGER.info("START");

	    // Create validator factory
	    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    Validator validator = factory.getValidator();

	    // Validate based on bean annotations
	    Set<ConstraintViolation<Country>> violations = validator.validate(country);
	    List<String> errors = new ArrayList<>();

	    for (ConstraintViolation<Country> violation : violations) {
	        errors.add(violation.getMessage());
	    }

	    if (!errors.isEmpty()) {
	        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, errors.toString());
	    }

	    LOGGER.info("END");
	    return country;
	}

}
