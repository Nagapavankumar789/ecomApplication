package com.pavan.Repository;

import org.springframework.stereotype.Repository;

import com.pavan.Entity.Department;

@Repository
public class DepartmentRepository {
	
	public Department getDepartment( int id) {
		return new Department(1, "IT","Software Eingneer");
	}
	

}
