package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.northWind.entity.InventoryTransactionTypes;

public interface InventoryTransactionTypesRepository extends CrudRepository<InventoryTransactionTypes, Integer>{
    
}


