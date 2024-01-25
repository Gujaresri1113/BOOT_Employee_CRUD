package com.example.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;
import com.example.employee.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	
	public Employee addEmployee(Employee employee) {
		Employee save = repo.save(employee);
		return save;
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> findAll = repo.findAll();
		return findAll;
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	public Employee updateEmployee(Employee emp) {
		Employee emp_save = repo.save(emp);
		return emp_save;
	}
	
}
