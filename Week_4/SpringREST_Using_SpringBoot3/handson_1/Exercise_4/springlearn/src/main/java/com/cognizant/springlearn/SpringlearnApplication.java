package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;


@SpringBootApplication
public class SpringlearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringlearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringlearnApplication.class, args);
		displayAllCountries();
	}

	public static void displayAllCountries() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		CountryList countryListBean = context.getBean("countryList", CountryList.class);
		List<Country> countries = countryListBean.getCountryList();

		LOGGER.debug("--------------- Country List ---------------");
		for(Country country : countries) {
			LOGGER.debug("Country : {}", country);
		}

		context.close();
	}

}
