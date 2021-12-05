package com.anjana.ecomm.service.impl;

import org.springframework.stereotype.Service;

import com.anjana.ecomm.model.Employee;
import com.anjana.ecomm.repository.EmployeeRepository;
import com.anjana.ecomm.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

}
