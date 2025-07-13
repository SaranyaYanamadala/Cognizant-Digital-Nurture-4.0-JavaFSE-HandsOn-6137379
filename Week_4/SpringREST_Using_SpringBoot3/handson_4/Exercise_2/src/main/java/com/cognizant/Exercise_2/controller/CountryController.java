package com.cognizant.Exercise_2.controller;

import com.cognizant.Exercise_2.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @PostMapping("/countries")
    public Country addCountry(@RequestBody Country country) {
        LOGGER.info("START");
        LOGGER.debug("Received Country: {}", country.getCode() + ", " + country.getName());
        LOGGER.info("END");
        return country;
    }
}
