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

import com.example.northWind.entity.InventoryTransactionTypes;
import com.example.northWind.repository.InventoryTransactionTypesRepository;

@RestController
public class InventoryTransactionTypesController {
    @Autowired
    private InventoryTransactionTypesRepository repository;

    @GetMapping("/inventorytransactiontype/{id}")
    public Optional<InventoryTransactionTypes> getInventoryTransactionType(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/inventorytransactiontypes")
    public Iterable<InventoryTransactionTypes> getInventoryTransactionTypes(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/inventorytransactiontype")
    public InventoryTransactionTypes save(@RequestBody InventoryTransactionTypes inventorytransactiontype){
        return repository.save(inventorytransactiontype);
    }

    //update = save
    @PutMapping("/inventorytransactiontype")
    public InventoryTransactionTypes update(@RequestBody InventoryTransactionTypes inventorytransactiontype){
        return repository.save(inventorytransactiontype);
    }

    @DeleteMapping("/inventorytransactiontype")
    public void delete(@RequestBody InventoryTransactionTypes inventorytransactiontype){
        repository.delete(inventorytransactiontype);
    }
    
}
