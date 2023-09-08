package com.goldilocks.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<CustomErrorDetails> AdminException(EmployeeNotFoundException ad,WebRequest wrq){
		
		CustomErrorDetails err=new CustomErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<CustomErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<CustomErrorDetails> MethodArgumentNotValidException(MethodArgumentNotValidException ad,WebRequest wrq){
		
		CustomErrorDetails err=new CustomErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<CustomErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<CustomErrorDetails> NoHandlerFoundException(NoHandlerFoundException ad,WebRequest wrq){
		
		CustomErrorDetails err=new CustomErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<CustomErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomErrorDetails> AllException(Exception ad,WebRequest wrq){
		
		CustomErrorDetails err=new CustomErrorDetails();
		err.setLocaldateTime(LocalDateTime.now());
		err.setMessage(ad.getMessage());
		err.setDescription(wrq.getDescription(false));
		
		return new ResponseEntity<CustomErrorDetails>(err,HttpStatus.BAD_GATEWAY);
	}
	
}
