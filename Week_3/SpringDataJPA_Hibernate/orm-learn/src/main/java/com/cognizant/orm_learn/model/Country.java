package com.cognizant.orm_learn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;


@Entity
@Table(name = "country")
public class Country {
	
	@Id
	@Column(name = "co_code")
	private String code;
	
	@Column(name = "co_name")
	private String name;
	
	// Getters and Setters
	public String getId() {
		return code;
	}
	
	public void setId(String code) {
		this.code = code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return "Country [id = " + code + ", name = " + name + "]";
	}
}
