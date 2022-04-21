package com.dxc.EmployeeCRUD.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxc.EmployeeCRUD.entity.Employee;
import com.dxc.EmployeeCRUD.respository.EmployeeRepository;

@Component
public class EmployeeServices {
	@Autowired
	private EmployeeRepository br;

	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = (List<Employee>) br.findAll();
		return employeeList;
	}

	public Employee getEmployeeById(int id) {
		Employee employee = null;
		employee = br.findById(id);
		return employee;

	}

	public Employee addEmployee(Employee b) {
		Employee employee = br.save(b);
		return employee;
	}

	public void deleteEmployee(int id) {
		br.deleteById(id);
	}

	public void updateEmployeeById(int id, Employee b) {
		b.setEid(id);
		br.save(b);
	}

}
