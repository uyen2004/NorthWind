package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.northWind.entity.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer>{
    
}


