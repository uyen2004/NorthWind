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

import com.example.northWind.entity.Invoices;
import com.example.northWind.repository.InvoicesRepository;


@RestController
public class InvoicesController {
    @Autowired
    private InvoicesRepository repository;

    @GetMapping("/invoice/{id}")
    public Optional<Invoices> getInvoice(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/invoices")
    public Iterable<Invoices> getInvoices(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/invoice")
    public Invoices save(@RequestBody Invoices invoice){
        return repository.save(invoice);
    }

    //update = save
    @PutMapping("/invoice")
    public Invoices update(@RequestBody Invoices invoice){
        return repository.save(invoice);
    }

    @DeleteMapping("/invoice")
    public void delete(@RequestBody Invoices invoice){
        repository.delete(invoice);
    }
    
}
