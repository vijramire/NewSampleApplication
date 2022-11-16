package com.employeeDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.employee.entity.EmployeeEntity.class","com.employee.repo.EmployeeEntityRepo.class"})
public class EmployeeDataWithRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDataWithRestApplication.class, args);
	}

}
