package com.cognizant.Exercise_3.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.Exercise_3.dao.DepartmentDao;
import com.cognizant.Exercise_3.model.Department;

@Service
public class DepartmentService {

    private DepartmentDao departmentDao = new DepartmentDao();

    @Transactional
    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}