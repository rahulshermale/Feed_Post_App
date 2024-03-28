package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Parent;
import com.example.repository.ParentRepository;

@RestController
@RequestMapping("/api/parents")
public class ParentController {
    
    @Autowired
    private ParentRepository parentRepository;
    
    @GetMapping
    public List<Parent> getAllParents() {
        return ((ListCrudRepository<Parent, Long>) parentRepository).findAll();
    }
    
    @PostMapping
    public Parent createParent(@RequestBody Parent parent) {
        return ((CrudRepository<Parent, Long>) parentRepository).save(parent);
    }
    
    // other CRUD methods as needed
}