package com.example.northWind.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.northWind.entity.InventoryTransactions;
import com.example.northWind.repository.InventoryTransactionsRepository;





@RestController
public class InventoryTransactionsController {
    @Autowired
    private InventoryTransactionsRepository repository;

    @GetMapping("/inventorytransaction/{id}")
    public Optional<InventoryTransactions> getInventoryTransaction(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/inventorytransactions")
    public Iterable<InventoryTransactions> getInventoryTransactions(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/inventorytransaction")
    public InventoryTransactions save(@RequestBody InventoryTransactions inventorytransaction){
        return repository.save(inventorytransaction);
    }

    //update = save
    @PutMapping("/inventorytransaction")
    public InventoryTransactions update(@RequestBody InventoryTransactions inventorytransaction){
        return repository.save(inventorytransaction);
    }

    @DeleteMapping("/inventorytransaction")
    public void delete(@RequestBody InventoryTransactions inventorytransaction){
        repository.delete(inventorytransaction);
    }
    
}
