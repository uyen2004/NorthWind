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

import com.example.northWind.entity.Shippers;
import com.example.northWind.repository.ShippersRepository;

@RestController
public class ShippersController {
    @Autowired
    private ShippersRepository repository;

    @GetMapping("/shipper/{id}")
    public Optional<Shippers> getShipper(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/shippers")
    public Iterable<Shippers> getShippers(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/shipper")
    public Shippers save(@RequestBody Shippers shipper){
        return repository.save(shipper);
    }

    //update = save
    @PutMapping("/shipper")
    public Shippers update(@RequestBody Shippers shipper){
        return repository.save(shipper);
    }

    @DeleteMapping("/shipper")
    public void delete(@RequestBody Shippers shipper){
        repository.delete(shipper);
    }
    
}
