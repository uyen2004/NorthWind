package com.example.northWind.repository;
import com.example.northWind.entity.Employees;

import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employees, Integer>{
    
}


