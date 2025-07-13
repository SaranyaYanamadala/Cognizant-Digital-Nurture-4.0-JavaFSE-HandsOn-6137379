package com.cognizant.Exercise_3.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.Exercise_3.model.Department;

public class DepartmentDao {
    public static List<Department> DEPARTMENT_LIST;

    @SuppressWarnings("unchecked")
	public DepartmentDao() {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("department.xml");
        DEPARTMENT_LIST = context.getBean("departmentList", ArrayList.class);
        
        context.close();    
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}