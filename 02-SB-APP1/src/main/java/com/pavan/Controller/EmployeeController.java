package com.pavan.Controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pavan.DTOs.EmployeeDto;
import com.pavan.Entity.Employee;
import com.pavan.Exceptions.ResourceNotfoundException;
import com.pavan.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable int id) {
		if (id !=1) {
			throw new ResourceNotfoundException("User with id"+id+"not found");
		}
	EmployeeDto employee = empservice.getEmployee(id);
		return ResponseEntity.ok(employee);	
		
	}
	
	
//	@ExceptionHandler(ResourceNotfoundException.class)
//	public ResponseEntity<Object> handleResourcenotfound(ResourceNotfoundException ex){
//		
//		Map<String, Object> body = new HashMap<>();
//        body.put("timestamp", LocalDateTime.now());
//        body.put("status", HttpStatus.NOT_FOUND.value());
//        body.put("error", "Resource Not Found");
//        body.put("message", ex.getMessage());
//
//        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
//		
//	}

}
