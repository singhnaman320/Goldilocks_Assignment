package com.goldilocks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldilocks.exceptions.EmployeeNotFoundException;
import com.goldilocks.models.Employee;
import com.goldilocks.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeNotFoundException {
		
		Employee emp= repository.save(employee);
		
		return emp;
	}
	
	// problem statement valid here
	
	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeNotFoundException {
		
		List<Employee> employees= repository.findAll();
		
		if(employees.isEmpty()) {
			
			throw new EmployeeNotFoundException("Unable to find employee");
		}
		return employees;
	}
	
}
