package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.northWind.entity.OrdersStatus;

public interface OrdersStatusRepository extends CrudRepository<OrdersStatus, Integer>{
    
}


