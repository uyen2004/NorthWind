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


import com.example.northWind.entity.OrdersTaxStatus;
import com.example.northWind.repository.OrdersTaxStatusRepository;

@RestController
public class OrdersTaxStatusController {
    @Autowired
    private OrdersTaxStatusRepository repository;

    @GetMapping("/ordertaxstatus/{id}")
    public Optional<OrdersTaxStatus> getOrderTaxStatusById(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/orderstaxstatus")
    public Iterable<OrdersTaxStatus> getOrdersTaxStatus(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/orderstaxstatus")
    public OrdersTaxStatus save(@RequestBody OrdersTaxStatus orderstaxstatus){
        return repository.save(orderstaxstatus);
    }

    //update = save
    @PutMapping("/orderstaxstatus")
    public OrdersTaxStatus update(@RequestBody OrdersTaxStatus orderstaxstatus){
        return repository.save(orderstaxstatus);
    }

    @DeleteMapping("/orderstaxstatus")
    public void delete(@RequestBody OrdersTaxStatus orderstaxstatus){
        repository.delete(orderstaxstatus);
    }
    
}
