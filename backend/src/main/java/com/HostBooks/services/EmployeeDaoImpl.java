package com.HostBooks.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HostBooks.Exception.EmployeeException;
import com.HostBooks.model.Employee;
import com.HostBooks.repository.EmployeeRepository;

@Service
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) throws EmployeeException {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeException("Employee not exist with id :" + id));
		return employee;
	}

	@Override
	public Employee updateEmployee(Long id, Employee employeeDetails) throws EmployeeException {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeException("Employee not exist with id :" + id));
		
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		
		Employee updatedEmployee = employeeRepository.save(employee);
		
		return updatedEmployee;
	}

	@Override
	public Map<String, Boolean> deleteEmployee(Long id) throws EmployeeException {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeException("Employee not exist with id :" + id));
		
		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		
		return response;
	}

}
