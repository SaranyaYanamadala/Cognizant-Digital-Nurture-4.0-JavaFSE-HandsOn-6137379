package com.cognizant.Exercise_1.model;

public class Skill {
	private String name;
	
	public Skill() {
        System.out.println("Inside Skill Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Skill{name='" + name + "'}";
    }
}
