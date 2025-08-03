package com.hr.controller;

import org.springframework.web.bind.annotation.*;

import com.hr.entity.Employee;
import com.hr.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
    private EmployeeService empServ;

    
    @PostMapping("/save")
    public Employee saveEmpInfo(@RequestBody Employee emp) {
        return empServ.saveEmpInfo(emp);
    }
}

