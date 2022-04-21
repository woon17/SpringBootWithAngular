package com.dxc.EmployeeCRUD.respository;

import org.springframework.data.repository.CrudRepository;

import com.dxc.EmployeeCRUD.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	// change the method for findById(integer id)
	public Employee findById(int id);

}
