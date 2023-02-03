package com.example.northWind.repository;
import com.example.northWind.entity.Customers;

import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Integer>{
    
}


