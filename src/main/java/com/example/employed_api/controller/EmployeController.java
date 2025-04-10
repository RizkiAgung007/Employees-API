package com.example.employed_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employed_api.model.WrapResponse;
import com.example.employed_api.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public WrapResponse getEmployees() {
        return employeeService.getAllEmployees();
    }
}
