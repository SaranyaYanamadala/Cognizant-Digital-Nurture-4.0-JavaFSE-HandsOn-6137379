package com.cognizant.orm_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {
	
	private static CountryService countryService;
	
	private static final Logger LOGGER  = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) throws CountryNotFoundException {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		
		testAddCountry();
	}
	
	/*private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("Countries = {}", countries);
		LOGGER.info("End");
	}
	
	private static void getAllCountriesTest() throws CountryNotFoundException {
        LOGGER.info("Start");
        Country country = countryService.findCountryByCode("IN");
        LOGGER.debug("Country:{}", country);
        LOGGER.info("End");
    }*/
	
	public static void testAddCountry() {
		LOGGER.info("Start testAddCountry");

		Country newCountry = new Country();
		newCountry.setId("ZZ");
		newCountry.setName("Zanzibar");

		// Add the new country
		countryService.addCountry(newCountry);

		try {
			Country retrievedCountry = countryService.findCountryByCode("ZZ");
			LOGGER.info("Retrieved Country: {}", retrievedCountry);
		} catch (CountryNotFoundException e) {
			LOGGER.error("Country not found: {}", e.getMessage());
		}

		LOGGER.info("End testAddCountry");
	}
}



