package com.learn.employeedirectory.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.employeedirectory.entity.Employee;
import com.learn.employeedirectory.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee findById(@PathVariable("employeeId") long theId) {
		return employeeService.findById(theId);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/employees/{employeeId}")
	public void delete(@PathVariable("employeeId") long theId) {
		employeeService.deleteById(theId);
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/employees/")
	public void delete(@RequestBody Employee theEmployee) {
		employeeService.save(theEmployee);
	}
}
