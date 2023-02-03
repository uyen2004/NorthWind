package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.northWind.entity.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Integer>{
    
}


