package com.cognizant.account.model;

public class Account {

	private String number;
	private String type;
	private double balance;
	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(String number, String type, double balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Employee [number=" + number + ", type=" + type + ", balance=" + balance + "]";
	}
	
	
}
