package com.pavan.DTOs;

import com.pavan.Entity.Employee;

public class EmployeeDto {
	int id;
	
	
	public EmployeeDto(int id, String name, String dept, Integer age) {
		super();
		this.id = id;
		Name = name;
		this.dept = dept;
		this.age = age;
	}

	public EmployeeDto() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	String Name;
	String dept;
	Integer age;



	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}
	
	public EmployeeDto EmployeeMapper(Employee employee) {
		this.setName(employee.getName());
		this.setDept(employee.getDept());
		this.setAge(employee.getAge());
		return this;
	}


	

}
