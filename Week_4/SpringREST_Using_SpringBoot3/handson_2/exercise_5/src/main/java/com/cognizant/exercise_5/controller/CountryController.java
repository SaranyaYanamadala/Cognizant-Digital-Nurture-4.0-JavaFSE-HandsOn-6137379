package com.cognizant.exercise_5.controller;

import com.cognizant.exercise_5.Country;
import com.cognizant.exercise_5.service.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.debug("START: getCountry()");
        Country country = countryService.getCountry(code);
        LOGGER.debug("END: getCountry()");
        return country;
    }
}
