package com.cognizant.Exercise_2.dao;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.Exercise_2.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Repository;

@Repository
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
