package com.dxc.EmployeeCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.EmployeeCRUD.entity.Employee;
import com.dxc.EmployeeCRUD.services.EmployeeServices;


@RestController
public class EmployeeController {
	// Injection for EmployeeServices
	@Autowired
	private EmployeeServices bs;

	// this mapping is going to fetch us all the employees from database
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return bs.getAllEmployees();
	}

	//only fetch specific employee 
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return bs.getEmployeeById(id);
	}

	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee b) {
		Employee employee = null;
		employee = bs.addEmployee(b);
		return employee;
	}

	@DeleteMapping("/deleteemployee/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		bs.deleteEmployee(id);
	}

	// update the existing data in the database
	@PutMapping("/updateemployee/{id}")
	public void updateEmployeeById(@PathVariable("id") int id, @RequestBody Employee b) {
		bs.updateEmployeeById(id, b);
	}
}
