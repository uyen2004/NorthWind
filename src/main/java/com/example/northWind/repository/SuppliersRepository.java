package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.northWind.entity.Suppliers;

public interface SuppliersRepository extends CrudRepository<Suppliers, Integer>{
    
}


