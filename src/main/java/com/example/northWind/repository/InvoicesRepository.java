package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.northWind.entity.Invoices;

public interface InvoicesRepository extends CrudRepository<Invoices, Integer>{
    
}


