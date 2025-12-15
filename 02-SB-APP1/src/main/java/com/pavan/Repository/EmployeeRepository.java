package com.pavan.Repository;

import org.springframework.stereotype.Repository;

import com.pavan.Entity.Employee;

@Repository
public class EmployeeRepository {
	
	public Employee getEmployee(int id) {
		
		return new Employee(1,"pavan","IT",28);
	}

}
