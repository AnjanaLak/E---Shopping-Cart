package com.anjana.ecomm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjana.ecomm.model.Employee;
import com.anjana.ecomm.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	// need to inject the constructor based dependency here
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	// build create employee Rest API
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee) , HttpStatus.CREATED);
	}
	
}
