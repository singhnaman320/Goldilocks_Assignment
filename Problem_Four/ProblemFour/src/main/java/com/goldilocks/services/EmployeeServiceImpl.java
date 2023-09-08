package com.goldilocks.services;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Employee getEmployeeById(Integer employeeId) throws EmployeeNotFoundException {
		
		return repository.findById(employeeId).orElseThrow(()-> new EmployeeNotFoundException("Employee does not exist.."));
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeNotFoundException {
		
		List<Employee> employees= repository.findAll();
		
		if(employees.isEmpty()) {
			
			throw new EmployeeNotFoundException("Unable to find employee");
		}
		return employees;
	}

	@Override
	public Employee deleteEmployeeById(Integer employeeId) throws EmployeeNotFoundException {
		
		Optional<Employee>opt= repository.findById(employeeId);
		
		if(opt.isPresent()) {
			
			Employee existingEmployee= opt.get();
			repository.delete(existingEmployee);
			
			return existingEmployee;
			
		}else {
			
			throw new EmployeeNotFoundException("Unable to delete employee details");
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		
		Optional<Employee>opt= repository.findById(employee.getEmployeeId());
		
		if(opt.isPresent()) {
			
			Employee updatedEmployee= repository.save(employee);
			
			return updatedEmployee;
			
		}else {
			
			throw new EmployeeNotFoundException("Unable to update employee details");
		}
	}

}
