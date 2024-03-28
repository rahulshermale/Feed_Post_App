package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Child;

public interface ChildRepository extends JpaRepository<Child, Long> {
}