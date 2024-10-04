package com.cgi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.model.Employee;
import com.cgi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
//	public String getAllEmployees() {
		return employeeService.getAllEmployees();
//		return "All employees are retrieved";
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
//	public String getEmployeeById(@PathVariable Long id) {
			return employeeService.getEmployeeById(id);
//		return "Sam";
	}
	
	@GetMapping("/test")
	public String testApplication() {
//	public String getEmployeeById(@PathVariable Long id) {
			return "Employee Application access is successful";
//		return "Sam";
	}

}
