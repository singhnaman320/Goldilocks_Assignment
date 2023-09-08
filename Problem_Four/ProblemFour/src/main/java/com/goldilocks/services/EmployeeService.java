package com.goldilocks.services;

import java.util.List;

import com.goldilocks.exceptions.EmployeeNotFoundException;
import com.goldilocks.models.Employee;

public interface EmployeeService {

	public Employee registerEmployee(Employee employee)throws EmployeeNotFoundException;
	
	// problem statement valid here	
	public Employee getEmployeeById(Integer employeeId)throws EmployeeNotFoundException;
	
	public List<Employee> getAllEmployeeDetails()throws EmployeeNotFoundException;
	
	public Employee deleteEmployeeById(Integer employeeId)throws EmployeeNotFoundException;
	
	public Employee updateEmployee(Employee employee)throws EmployeeNotFoundException;
}
