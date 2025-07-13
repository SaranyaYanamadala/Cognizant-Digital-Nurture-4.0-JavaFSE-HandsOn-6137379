package com.cognizant.Exercise_2.model;

public class Employee {
	private int id;
    private String name;
    private double salary;
    private String dateOfBirth;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id = " + id + ", name = " + name + ", salary = " + salary + ", dateOfBirth = " + dateOfBirth + "]";
	}
    
    
}
