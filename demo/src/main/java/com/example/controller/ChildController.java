package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Child;
import com.example.repository.ChildRepository;

@RestController
@RequestMapping("/children")
public class ChildController {
    
    @Autowired
    private ChildRepository childRepository;
    
    @GetMapping
    public List<Child> getAllChildren() {
        return childRepository.findAll();
    }
    
    @PostMapping
    public Child createChild(@RequestBody Child child) {
        return childRepository.save(child);
    }
    
    
    
    // other CRUD methods as needed
}
