package com.goldilocks.services;

import java.util.List;

import com.goldilocks.exceptions.EmployeeNotFoundException;
import com.goldilocks.models.Employee;

public interface EmployeeService {

	public Employee registerEmployee(Employee employee)throws EmployeeNotFoundException;
	
	// problem statement valid here	
	public List<Employee> getAllEmployeeDetails()throws EmployeeNotFoundException;
	
}
