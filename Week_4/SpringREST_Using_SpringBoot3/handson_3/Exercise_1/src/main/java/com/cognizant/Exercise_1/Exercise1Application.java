package com.cognizant.Exercise_1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.Exercise_1.dao.EmployeeDao;
import com.cognizant.Exercise_1.model.Employee;

import java.util.List;

@SpringBootApplication
public class Exercise1Application {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		List<Employee> employees = dao.getAllEmployees();
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
