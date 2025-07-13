package com.cognizant.Exercise_1.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.Exercise_1.model.Employee;

public class EmployeeDao {

    private static List<Employee> EMPLOYEE_LIST;

    @SuppressWarnings("unchecked")
	public EmployeeDao() {
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        EMPLOYEE_LIST = context.getBean("employeeList", ArrayList.class);
        ((ClassPathXmlApplicationContext) context).close();
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}