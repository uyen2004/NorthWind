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

import com.example.northWind.entity.OrderDetailsStatus;
import com.example.northWind.repository.OrderDetailsStatusRepository;




@RestController
public class OrderDetailsStatusController {
    @Autowired
    private OrderDetailsStatusRepository repository;

    @GetMapping("/orderdetails_status/{id}")
    public Optional<OrderDetailsStatus> getOrderDetailsStatusById(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/orderdetailsstatus")
    public Iterable<OrderDetailsStatus> getOrderDetailsStatus(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/orderdetailsstatus")
    public OrderDetailsStatus save(@RequestBody OrderDetailsStatus orderdetailsstatus){
        return repository.save(orderdetailsstatus);
    }

    //update = save
    @PutMapping("/orderdetailsstatus")
    public OrderDetailsStatus update(@RequestBody OrderDetailsStatus orderdetailsstatus){
        return repository.save(orderdetailsstatus);
    }

    @DeleteMapping("/orderdetailsstatus")
    public void delete(@RequestBody OrderDetailsStatus orderdetailsstatus){
        repository.delete(orderdetailsstatus);
    }
    
}
