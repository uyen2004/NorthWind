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

import com.example.northWind.entity.SalesReports;
import com.example.northWind.repository.SalesReportsRepository;


@RestController
public class SalesReportsController {
    @Autowired
    private SalesReportsRepository repository;

    @GetMapping("/salesreport/{id}")
    public Optional<SalesReports> getSalesReport(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/salesreports")
    public Iterable<SalesReports> getSalesReports(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/salesreport")
    public SalesReports save(@RequestBody SalesReports salesreport){
        return repository.save(salesreport);
    }

    //update = save
    @PutMapping("/salesreport")
    public SalesReports update(@RequestBody SalesReports salesreport){
        return repository.save(salesreport);
    }

    @DeleteMapping("/salesreport")
    public void delete(@RequestBody SalesReports salesreport){
        repository.delete(salesreport);
    }
    
}
