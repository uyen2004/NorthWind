package com.example.northWind.repository;
import com.example.northWind.entity.PurchaseOrderStatus;

import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderStatusRepository extends CrudRepository<PurchaseOrderStatus, Integer>{
    
}


