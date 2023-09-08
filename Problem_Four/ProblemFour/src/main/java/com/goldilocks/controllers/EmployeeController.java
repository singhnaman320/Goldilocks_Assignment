package com.goldilocks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.goldilocks.exceptions.EmployeeNotFoundException;
import com.goldilocks.models.Employee;
import com.goldilocks.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> registerEmployeeHandler(@RequestBody Employee employee) throws EmployeeNotFoundException{
		
		Employee savEmployee= eService.registerEmployee(employee);
		
		return new ResponseEntity<Employee>(savEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/employees/{Id}")
	public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable("Id") Integer empId) throws EmployeeNotFoundException{
		
		Employee employee= eService.getEmployeeById(empId);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	@GetMapping(value = "/employees")
	public ResponseEntity<List<Employee>> getAllEmployeeDetailsHandler() throws EmployeeNotFoundException{
		
		List<Employee> employeesList= eService.getAllEmployeeDetails();
		
		return new ResponseEntity<List<Employee>>(employeesList, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmployeeHandler(@RequestBody Employee employee) throws EmployeeNotFoundException{
		
		Employee updatEmployee = eService.updateEmployee(employee);
		
		return new ResponseEntity<Employee>(updatEmployee, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/employees/{Id}")
	public ResponseEntity<Employee> deleteEmployeeByIdHandler(@PathVariable("Id") Integer empId) throws EmployeeNotFoundException{
		
		Employee deleteEmployee= eService.deleteEmployeeById(empId);
		
		return new ResponseEntity<Employee>(deleteEmployee, HttpStatus.OK);
	}
}
