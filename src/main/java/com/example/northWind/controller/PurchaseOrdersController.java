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

import com.example.northWind.entity.PurchaseOrders;
import com.example.northWind.repository.PurchaseOrdersRepository;

@RestController
public class PurchaseOrdersController {
    @Autowired
    private PurchaseOrdersRepository repository;

    @GetMapping("/purchaseorder/{id}")
    public Optional<PurchaseOrders> getPurchaseOrder(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/purchaseorders")
    public Iterable<PurchaseOrders> getPurchaseOrders(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/purchaseorder")
    public PurchaseOrders save(@RequestBody PurchaseOrders purchaseorder){
        return repository.save(purchaseorder);
    }

    //update = save
    @PutMapping("/purchaseorder")
    public PurchaseOrders update(@RequestBody PurchaseOrders purchaseorder){
        return repository.save(purchaseorder);
    }

    @DeleteMapping("/purchaseorder")
    public void delete(@RequestBody PurchaseOrders purchaseorder){
        repository.delete(purchaseorder);
    }
    
}
