package com.example.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//Parent.java
@Entity
public class Parent {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 private String name;
 
 @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
 private List<Child> children;
 
 // constructors, getters, setters
}
