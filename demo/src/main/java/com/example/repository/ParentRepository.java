package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Parent;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}