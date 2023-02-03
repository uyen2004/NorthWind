package com.example.northWind.repository;
import com.example.northWind.entity.PurchaseOrders;

import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrdersRepository extends CrudRepository<PurchaseOrders, Integer>{
    
}


