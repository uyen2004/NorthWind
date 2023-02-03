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

import com.example.northWind.entity.OrdersStatus;
import com.example.northWind.repository.OrdersStatusRepository;



@RestController
public class OrdersStatusController {
    @Autowired
    private OrdersStatusRepository repository;

    @GetMapping("/order_status/{id}")
    public Optional<OrdersStatus> getOrderStatus(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/orderstatus")
    public Iterable<OrdersStatus> getOrdersStatus(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/orderstatus")
    public OrdersStatus save(@RequestBody OrdersStatus orderstatus){
        return repository.save(orderstatus);
    }

    //update = save
    @PutMapping("/orderstatus")
    public OrdersStatus update(@RequestBody OrdersStatus orderstatus){
        return repository.save(orderstatus);
    }

    @DeleteMapping("/orderstatus")
    public void delete(@RequestBody OrdersStatus orderstatus){
        repository.delete(orderstatus);
    }
    
}
