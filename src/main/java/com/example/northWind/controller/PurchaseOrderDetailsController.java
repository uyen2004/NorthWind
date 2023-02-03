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

import com.example.northWind.entity.PurchaseOrderDetails;
import com.example.northWind.repository.PurchaseOrderDetailsRepository;

@RestController
public class PurchaseOrderDetailsController {
    @Autowired
    private PurchaseOrderDetailsRepository repository;

    @GetMapping("/purchaseorderdetail/{id}")
    public Optional<PurchaseOrderDetails> getPurchaseOrderDetail(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/purchaseorderdetails")
    public Iterable<PurchaseOrderDetails> getPurchaseOrderDetails(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/purchaseorderdetail")
    public PurchaseOrderDetails save(@RequestBody PurchaseOrderDetails purchaseorderdetail){
        return repository.save(purchaseorderdetail);
    }

    //update = save
    @PutMapping("/purchaseorderdetail")
    public PurchaseOrderDetails update(@RequestBody PurchaseOrderDetails purchaseorderdetail){
        return repository.save(purchaseorderdetail);
    }

    @DeleteMapping("/purchaseorderdetail")
    public void delete(@RequestBody PurchaseOrderDetails purchaseorderdetail){
        repository.delete(purchaseorderdetail);
    }
    
}
