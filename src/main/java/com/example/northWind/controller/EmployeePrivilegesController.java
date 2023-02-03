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

import com.example.northWind.entity.EmployeePrivileges;
import com.example.northWind.repository.EmployeePrivilegesRepository;

@RestController
public class EmployeePrivilegesController {
    @Autowired
    private EmployeePrivilegesRepository repository;

    @GetMapping("/employeeprivilege/{id}")
    public Optional<EmployeePrivileges> getEmployeePrivilege(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @GetMapping("/employeeprivileges")
    public Iterable<EmployeePrivileges> getEmployeePrivileges(){
        return repository.findAll();
    }
    //insert = save
    @PostMapping("/employeeprivileges")
    public EmployeePrivileges save(@RequestBody EmployeePrivileges employeeprivilege){
        return repository.save(employeeprivilege);
    }

    //update = save
    @PutMapping("/employeeprivilege")
    public EmployeePrivileges update(@RequestBody EmployeePrivileges employeeprivilege){
        return repository.save(employeeprivilege);
    }

    @DeleteMapping("/employeeprivilege")
    public void delete(@RequestBody EmployeePrivileges employeeprivilege){
        repository.delete(employeeprivilege);
    }
    
}
