package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Task;
import com.example.services.TaskmanagerServices;

@RestController
@RequestMapping("/api")
public class TaskmanagerController {
    
    @Autowired
    private TaskmanagerServices services;

    @GetMapping("/tasks")
    public List<Task> getAll(){
        return this.services.getAll();
    }

    @GetMapping("/tasks/{id}")
    public Optional<Task> getById(@PathVariable String id){
        return this.services.getById(id);
    }

    @GetMapping("/tasks/status/{status}")
    public Optional<Task> getByStatus(@PathVariable String status){
        return this.services.getByStatus(status);
    }
}
