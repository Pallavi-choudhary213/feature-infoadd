package com.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.entity.Employee;
import com.hr.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	public Employee saveEmpInfo(Employee emp) {
		 return empRepo.save(emp);
	     
	 }
	
}
