package com.HostBooks.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<MyErrorDetails> UserExceptionHandler(EmployeeException exception,WebRequest req){
		
		MyErrorDetails myErr = new MyErrorDetails(LocalDateTime.now(), exception.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(myErr,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExceptionHandler(Exception exception,WebRequest req){
		
		MyErrorDetails myErr = new MyErrorDetails(LocalDateTime.now(), exception.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(myErr,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException noHandlerFoundException,WebRequest req)  {
			
	
	MyErrorDetails myErr = new MyErrorDetails(LocalDateTime.now(), noHandlerFoundException.getMessage(), req.getDescription(false));
	
		return new ResponseEntity<>(myErr,HttpStatus.BAD_REQUEST);
					
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> methodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException,WebRequest req)  {
			
	
	MyErrorDetails myErr=new MyErrorDetails(LocalDateTime.now(), methodArgumentNotValidException.getBindingResult().getFieldError().getDefaultMessage(), req.getDescription(false));
	
		return new ResponseEntity<>(myErr,HttpStatus.BAD_REQUEST);
					
	}

}
