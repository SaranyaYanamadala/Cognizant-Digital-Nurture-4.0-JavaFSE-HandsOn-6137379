package com.cognizant.customer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @RestController
    @RequestMapping("/customers")
    class CustomerController {
        @GetMapping("/info")
        public String getCustomerInfo() {
            return "Customer information from Customer Service!";
        }

        @GetMapping("/profile")
        public String getCustomerProfile() {
            return "Customer Profile data (original path /customers/profile)";
        }
    }
}
