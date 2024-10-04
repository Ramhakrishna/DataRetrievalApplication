package com.cgi.repository;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cgi.model.Employee;

@Repository
public class EmployeeRepository {

	private final JdbcTemplate jdbcTemplate;

	public EmployeeRepository(JdbcTemplate jdbcTemplate) {
		// TODO Auto-generated constructor stub
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Employee> findAll() {
		String sql = "Select id, name, department from Employee";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
	}

	public Employee findById(Long id) {
		String sql = "Select id, name, department from Employee where id = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), id);
	}
}
