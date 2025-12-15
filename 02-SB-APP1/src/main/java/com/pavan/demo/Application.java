package com.pavan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.pavan"})
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ApplicationContext= SpringApplication.run(Application.class, args);
		/*System.out.println("Context Created");
		ApplicationContext.close();
		System.out.println("close all the connections");
	*/
		}

}
