package com.cognizant.Exercise_8.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Country not found.")
public class CountryNotFoundException extends Exception {
	public CountryNotFoundException(String msg) {
		super(msg);
	}
}
