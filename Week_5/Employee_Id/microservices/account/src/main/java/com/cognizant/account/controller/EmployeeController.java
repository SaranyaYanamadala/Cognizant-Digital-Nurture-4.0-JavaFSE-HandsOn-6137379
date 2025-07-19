package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class EmployeeController {

	@GetMapping("/{number}")
	public Account getEmployeeAccount(@PathVariable String number) {
		return new Account(number, "Savings", 234343);
	}
}
