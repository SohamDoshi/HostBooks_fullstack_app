package com.HostBooks.services;

import java.util.List;
import java.util.Map;

import com.HostBooks.Exception.EmployeeException;
import com.HostBooks.model.Employee;

public interface EmployeeDao {
	
	public List<Employee> getAllEmployees();
	
	public Employee createEmployee(Employee employee);

	public Employee getEmployeeById(Long id) throws EmployeeException;
	
	public Employee updateEmployee(Long id, Employee employeeDetails) throws EmployeeException;
	
	public Map<String, Boolean> deleteEmployee(Long id) throws EmployeeException;
}
