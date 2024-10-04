package com.cgi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cgi.model.Employee;
import com.cgi.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		// TODO Auto-generated constructor stub
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}
}
