package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.northWind.entity.OrdersTaxStatus;

public interface OrdersTaxStatusRepository extends CrudRepository<OrdersTaxStatus, Integer>{
    
}


