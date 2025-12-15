package com.pavan.DTOs;

import com.pavan.Entity.Employee;

public class EmployeeMapper {
		
	 public static EmployeeDto toDto(Employee employee) {
	        return new EmployeeDto( 
	        		employee.getId(),
	        		employee.getName(),
	        		employee.getDept(),
	        		employee.getAge()
	        		);
	    }

	    public static Employee toEntity(EmployeeDto dto) {
	        return new Employee(
	            dto.getId(),
	            dto.getName(),
	            dto.getDept(),
	            dto.getAge()
	        );
	        
			

}}
