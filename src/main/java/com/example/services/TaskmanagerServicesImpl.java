package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.entity.Task;
import com.example.repository.Tasks;

import java.util.List;
import java.util.Optional;

@Service
public class TaskmanagerServicesImpl implements TaskmanagerServices {
    
    @Autowired
    Tasks taskRepository;

    public List<Task> getAll(){
        return taskRepository.findAll();
    }
    
    public Optional<Task> getById(String id){
        return taskRepository.findById(id);
    }

    public Optional<Task> getByStatus(String status){
        return taskRepository.findByStatus(status);
    }
}
