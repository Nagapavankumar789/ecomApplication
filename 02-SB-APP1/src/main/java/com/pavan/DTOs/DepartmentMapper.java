package com.pavan.DTOs;

import com.pavan.Entity.Department;

public class DepartmentMapper {
	
	public static DepartmentDto toDto(Department Dep) {
		return new DepartmentDto(
				Dep.getId(),
				Dep.getRole(),
				Dep.getDeptname());
	}
	
	public static Department toEntity(DepartmentDto dto) {
		
		return new Department(
				dto.getId(),
				dto.getRole(),
				dto.getDeptname());
		
	}


}
