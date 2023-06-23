package com.HostBooks.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HostBooks.Exception.EmployeeException;
import com.HostBooks.model.Employee;
import com.HostBooks.services.EmployeeDaoImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;
	
	// get all employees
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployeesController(){
		List<Employee> employees = employeeDaoImpl.getAllEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}		
	
	// create employee rest api
	@PostMapping("/employees")
	public ResponseEntity<Employee> createEmployeeController(@RequestBody Employee employee) {
		Employee emp = employeeDaoImpl.createEmployee(employee);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	
	// get employee by id rest api
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeByIdController(@PathVariable Long id) throws EmployeeException {
		Employee emp = employeeDaoImpl.getEmployeeById(id);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	
	// update employee rest api
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployeeController(@PathVariable Long id, @RequestBody Employee employeeDetails) throws EmployeeException{
		Employee emp = employeeDaoImpl.updateEmployee(id, employeeDetails);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	
	// delete employee rest api
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployeeController(@PathVariable Long id) throws EmployeeException{
		Map<String, Boolean> res = employeeDaoImpl.deleteEmployee(id);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
}
