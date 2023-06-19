package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Task;

@Repository
public interface Tasks extends JpaRepository<Task, String>{
     public Optional<List<Task>> findByStatus(String status);
}
