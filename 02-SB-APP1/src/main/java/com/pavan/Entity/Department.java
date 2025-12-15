package com.pavan.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	int id;
	String deptname;
	String role;
	public Department() {
	}
	public Department(int id, String deptname, String role) {
		super();
		this.id = id;
		this.deptname = deptname;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
