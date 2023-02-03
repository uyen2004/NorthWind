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

import com.example.northWind.entity.Privileges;
import com.example.northWind.repository.PrivilegesRepository;

@RestController
public class PrivilegesController {
    @Autowired
    private PrivilegesRepository repository;

    @GetMapping("/privilege/{id}")
    public Optional<Privileges> getPrivileges(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/privileges")
    public Iterable<Privileges> getPrivileges(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/privilege")
    public Privileges save(@RequestBody Privileges privilege){
        return repository.save(privilege);
    }

    //update = save
    @PutMapping("/privilege")
    public Privileges update(@RequestBody Privileges privilege){
        return repository.save(privilege);
    }

    @DeleteMapping("/privilege")
    public void delete(@RequestBody Privileges privilege){
        repository.delete(privilege);
    }
    
}
