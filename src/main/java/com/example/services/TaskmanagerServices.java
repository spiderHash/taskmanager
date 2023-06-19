package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entity.Task;

public interface TaskmanagerServices {
    public List<Task> getAll();
    public Optional<Task> getById(String id);
    public Optional<List<Task>> getByStatus(String status);
    public Task postTask(Task task);
    public Task updateTask(Task task);
    public Task toggleTaskStatus(String id);
    public Boolean deleteTask(String id);
    public Boolean deleteAll();
}
