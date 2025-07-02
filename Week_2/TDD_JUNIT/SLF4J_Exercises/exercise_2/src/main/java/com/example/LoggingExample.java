package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        String user = "Saranya";
        int age = 21;
        String status = "active";

        logger.info("User {} has logged in." , user);
        logger.debug("User {} is {} years old and currently {}", user, age, status);
        logger.warn("This is a warning for user {}", user);
        logger.error("An error occurred while processing data for user {}", user);
    }
}