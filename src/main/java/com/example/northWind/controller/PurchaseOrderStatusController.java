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

import com.example.northWind.entity.PurchaseOrderStatus;
import com.example.northWind.repository.PurchaseOrderStatusRepository;

@RestController
public class PurchaseOrderStatusController {
    @Autowired
    private PurchaseOrderStatusRepository repository;

    @GetMapping("/purchaseorderstatus/{id}")
    public Optional<PurchaseOrderStatus> getPurchaseOrderStatusById(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/purchaseorder_status")
    public Iterable<PurchaseOrderStatus> getPurchaseOrderStatus(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/purchaseorderstatus")
    public PurchaseOrderStatus save(@RequestBody PurchaseOrderStatus purchaseorderstatus){
        return repository.save(purchaseorderstatus);
    }

    //update = save
    @PutMapping("/purchaseorderstatus")
    public PurchaseOrderStatus update(@RequestBody PurchaseOrderStatus purchaseorderstatus){
        return repository.save(purchaseorderstatus);
    }

    @DeleteMapping("/purchaseorderstatus")
    public void delete(@RequestBody PurchaseOrderStatus purchaseorderstatus){
        repository.delete(purchaseorderstatus);
    }
    
}
