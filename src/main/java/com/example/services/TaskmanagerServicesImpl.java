package com.example.services;

import org.springframework.stereotype.Service;

import com.example.response.Task;

@Service
public class TaskmanagerServicesImpl implements TaskmanagerServices {
    public Task getAll(){
        return new Task("1","A","b","V");
    }
}
