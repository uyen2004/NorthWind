package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.northWind.entity.PurchaseOrderDetails;

public interface PurchaseOrderDetailsRepository extends CrudRepository<PurchaseOrderDetails, Integer>{
    
}


