package com.pavan.DTOs;

import com.pavan.Entity.Department;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartmentDto {
	
	int id;
	String deptname;
	String role;
	
	public DepartmentDto(int id, String deptname, String role) {
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

	@Override
	public String toString() {
		return "DeparatmentDto [id=" + id + ", deptname=" + deptname + ", role=" + role + "]";
	}

	public DepartmentDto DepartmentMapper(Department dep) {
		this.setId(dep.getId());
		this.setDeptname(dep.getDeptname());
		this.setRole(dep.getRole());
		return this;
		
		
		
	}
	
	
	
	
	

}
