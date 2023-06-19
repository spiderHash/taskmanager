package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.Task;
import com.example.services.TaskmanagerServices;

@RestController
public class TaskmanagerController {
    
    @Autowired
    private TaskmanagerServices services;

    @GetMapping("tasks")
    public Task getAll(){
        return this.services.getAll();
    }

}
