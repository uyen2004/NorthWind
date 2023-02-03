package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.northWind.entity.OrderDetailsStatus;

public interface OrderDetailsStatusRepository extends CrudRepository<OrderDetailsStatus, Integer>{
    
}


