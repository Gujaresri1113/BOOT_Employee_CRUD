package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employee")
	@ResponseBody
	public List<Employee> getEmployeeData(){
		List<Employee> employee = service.getAllEmployee();
		return employee;
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee addEmployee = service.addEmployee(employee);
		return addEmployee;
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		service.deleteById(id);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployees(@RequestBody Employee emp) {
		Employee update_emp = service.updateEmployee(emp);
		return update_emp;
	}
}
