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

import com.example.northWind.entity.Products;
import com.example.northWind.repository.ProductsRepository;

@RestController
public class ProductsController {
    @Autowired
    private ProductsRepository repository;

    @GetMapping("/product/{id}")
    public Optional<Products> getProduct(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/products")
    public Iterable<Products> getProducts(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/product")
    public Products save(@RequestBody Products product){
        return repository.save(product);
    }

    //update = save
    @PutMapping("/product")
    public Products update(@RequestBody Products product){
        return repository.save(product);
    }

    @DeleteMapping("/product")
    public void delete(@RequestBody Products product){
        repository.delete(product);
    }
    
}
