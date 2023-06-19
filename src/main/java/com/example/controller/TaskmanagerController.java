package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Task;
import com.example.services.TaskmanagerServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class TaskmanagerController {
    
    @Autowired
    private TaskmanagerServices services;

    //display all tasks
    @GetMapping("/tasks")
    public List<Task> getAll(){
        return this.services.getAll();
    }

    //show task which matches id
    @GetMapping("/tasks/{id}")
    public Optional<Task> getById(@PathVariable String id){
        return this.services.getById(id);
    }

    //show tasks which match status (done or pending)
    @GetMapping("/tasks/status/{status}")
    public Optional<List<Task>> getByStatus(@PathVariable String status){
        return this.services.getByStatus(status);
    }

    //insert into tasks
    @PostMapping("/tasks")
    public Task postTask(@RequestBody Task task){
        return this.services.postTask(task);
    }
    
    //update task
    @PutMapping("/tasks")
    public Task updateTask(@RequestBody Task task){
        return this.services.updateTask(task);
    }

    //toggle status of task ie, make done to pending and pending to done
    @PutMapping("/tasks/status/{id}")
    public Task toggleTaskStatus(@PathVariable String id){
        return this.services.toggleTaskStatus(id);
    }

    //delete a task
    @DeleteMapping("/tasks/{id}")
    public Boolean deleteTask(@PathVariable String id){
        return this.services.deleteTask(id);
    }

    //delete all
    @DeleteMapping("/tasks")
    public Boolean deleteAll(){
        return this.services.deleteAll();
    }
}
