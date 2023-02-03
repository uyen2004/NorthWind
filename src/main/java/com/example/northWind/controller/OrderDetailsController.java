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

import com.example.northWind.entity.OrderDetails;
import com.example.northWind.repository.OrderDetailsRepository;




@RestController
public class OrderDetailsController {
    @Autowired
    private OrderDetailsRepository repository;

    @GetMapping("/orderdetail/{id}")
    public Optional<OrderDetails> getOrderDetail(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/orderdetails")
    public Iterable<OrderDetails> getOrderDetails(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/orderdetail")
    public OrderDetails save(@RequestBody OrderDetails orderdetail){
        return repository.save(orderdetail);
    }

    //update = save
    @PutMapping("/orderdetail")
    public OrderDetails update(@RequestBody OrderDetails orderdetail){
        return repository.save(orderdetail);
    }

    @DeleteMapping("/orderdetail")
    public void delete(@RequestBody OrderDetails orderdetail){
        repository.delete(orderdetail);
    }
    
}
