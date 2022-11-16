package com.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.employee.entity.EmployeeEntity;

@RepositoryRestResource(collectionResourceRel = "employees",path="employeestest")
public interface EmployeeEntityRepo extends JpaRepository<EmployeeEntity, Integer>{
  
}
