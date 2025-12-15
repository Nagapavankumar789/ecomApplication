package com.pavan.Service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.DTOs.EmployeeDto;
import com.pavan.Entity.Employee;
import com.pavan.Repository.EmployeeRepository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService //implements InitializingBean,DisposableBean
{
	
	
	private final EmployeeRepository empRepo;
	
	@Autowired
	public EmployeeService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
		System.out.println("Employee Created");
	}
	
	Logger logger =  LoggerFactory.getLogger(Employee.class);
	
	
	/*@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println(" After properties ");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
		
	}
	*/
	@PostConstruct
	public void init() {
		logger.info("intilize the database");
		//log.info("intilize the database");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroyed database ");
	}
	public EmployeeDto getEmployee(int id) {
		
		Employee employee = empRepo.getEmployee(id);
		EmployeeDto employeedto = new EmployeeDto();
		return employeedto.EmployeeMapper(employee);
	}



	

}
