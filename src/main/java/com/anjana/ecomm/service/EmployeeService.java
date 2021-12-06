package com.anjana.ecomm.service;

import java.util.List;

import com.anjana.ecomm.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
}
