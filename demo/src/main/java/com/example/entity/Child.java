package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Child.java
@Entity
public class Child {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

@ManyToOne
@JoinColumn(name = "parent_id", nullable = false)
private Parent parent;

// constructors, getters, setters
}
