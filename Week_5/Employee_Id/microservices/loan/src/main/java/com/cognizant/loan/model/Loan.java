package com.cognizant.loan.model;

public class Loan {

	private String number;
	private String type;
	private double loan;
	private double emi;
	private double tenure;
	
	
	public Loan(String number, String type, double loan, double emi, double tenure) {
		super();
		this.number = number;
		this.type = type;
		this.loan = loan;
		this.emi = emi;
		this.tenure = tenure;
	}


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


	public double getLoan() {
		return loan;
	}


	public void setLoan(double loan) {
		this.loan = loan;
	}


	public double getEmi() {
		return emi;
	}


	public void setEmi(double emi) {
		this.emi = emi;
	}


	public double getTenure() {
		return tenure;
	}


	public void setTenure(double tenure) {
		this.tenure = tenure;
	}


	@Override
	public String toString() {
		return "Loan [ number = " + number + ", type = " + type + ", loan = " + loan + ", emi = " + emi + ", tenure = " + tenure
				+ "]";
	}
	
	
	
	
}
