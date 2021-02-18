package com.learn.employeedirectory.service;

import java.util.List;

import com.learn.employeedirectory.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	
	public Employee findById(long id);
	
	public void save(Employee theEmployee);
	
	public void deleteById(long id);
}
