package com.goldilocks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.goldilocks.exceptions.EmployeeNotFoundException;
import com.goldilocks.models.Employee;
import com.goldilocks.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/test")
	public ResponseEntity<Employee> registerEmployeeHandler(@RequestBody Employee employee) throws EmployeeNotFoundException{
		
		Employee savEmployee= eService.registerEmployee(employee);
		
		return new ResponseEntity<Employee>(savEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/test")
	public ResponseEntity<List<Employee>> getAllEmployeeDetailsHandler() throws EmployeeNotFoundException{
		
		List<Employee> employeesList= eService.getAllEmployeeDetails();
		
		return new ResponseEntity<List<Employee>>(employeesList, HttpStatus.ACCEPTED);
	}
}
