package com.pavan.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	int id;
	String Name;
	String dept;
	Integer age;
	
	
	public Employee() {
	}

	public Employee(int id, String name, String dept, Integer age) {
		super();
		this.id = id;
		Name = name;
		this.dept = dept;
		this.age = age;
	}
	
	public String getName() {
		return Name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	

	

}
