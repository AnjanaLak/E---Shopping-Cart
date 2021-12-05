package com.anjana.ecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anjana.ecomm.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
