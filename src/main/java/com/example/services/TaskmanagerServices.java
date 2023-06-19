package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entity.Task;

public interface TaskmanagerServices {
    public List<Task> getAll();
    public Optional<Task> getById(String id);
    public Optional<Task> getByStatus(String status);
}
