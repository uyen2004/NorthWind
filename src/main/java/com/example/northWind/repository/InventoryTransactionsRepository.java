package com.example.northWind.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.northWind.entity.InventoryTransactions;

public interface InventoryTransactionsRepository extends CrudRepository<InventoryTransactions, Integer>{
    
}


