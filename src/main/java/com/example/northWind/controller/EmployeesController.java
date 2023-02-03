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


import com.example.northWind.entity.Employees;
import com.example.northWind.repository.EmployeesRepository;

@RestController
public class EmployeesController {
    @Autowired
    private EmployeesRepository repository;

    @GetMapping("/employee/{id}")
    public Optional<Employees> getEmployee(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/employees")
    public Iterable<Employees> getEmployees(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/employee")
    public Employees save(@RequestBody Employees employee){
        return repository.save(employee);
    }

    //update = save
    @PutMapping("/employee")
    public Employees update(@RequestBody Employees employee){
        return repository.save(employee);
    }

    @DeleteMapping("/employee")
    public void delete(@RequestBody Employees employee){
        repository.delete(employee);
    }
    
}
