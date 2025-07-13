package com.cognizant.Exercise_3.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Exercise_3.model.Department;
import com.cognizant.Exercise_3.service.DepartmentService;

@RestController
public class DepartmentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        LOGGER.info("START - getAllDepartments()");
        List<Department> list = departmentService.getAllDepartments();
        LOGGER.debug("Departments: {}", list);
        LOGGER.info("END - getAllDepartments()");
        return list;
    }
}