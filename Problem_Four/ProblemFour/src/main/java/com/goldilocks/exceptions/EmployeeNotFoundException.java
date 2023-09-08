package com.goldilocks.exceptions;

// User defined exception class
public class EmployeeNotFoundException extends Exception{
	
	public EmployeeNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
