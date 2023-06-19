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

    public Optional<List<Task>> getByStatus(String status){
        return taskRepository.findByStatus(status);
    }

    public Task postTask(Task task){
        if(!task.getId().isBlank())
        if(taskRepository.findById(task.getId()).isEmpty())
        return taskRepository.save(task);
        return null;
    }

    public Task updateTask(Task task){
        if(!task.getId().isBlank())
        {
            Task t = taskRepository.findById(task.getId()).get();
            {
                if(t == null)
                    return null;
                
                if(task.getTitle() ==null || task.getTitle().isEmpty() ) task.setTitle(t.getTitle());
                if(task.getStatus() ==null || task.getStatus().isEmpty() ) task.setStatus(t.getStatus());
                if(task.getDescription() ==null || task.getDescription().isEmpty() ) task.setDescription(t.getDescription());

                return taskRepository.save(task);
           }
        }
        return null;
    }

    
    public Task toggleTaskStatus(String id){

            Task task = taskRepository.findById(id).get();
            {
                if(task == null)
                    return null;
                
                if(task.getStatus().equals("done") ) task.setStatus("pending");
                else task.setStatus("done");

                return taskRepository.save(task);
           }
        
    }

    public Boolean deleteTask(String id){
        if(!taskRepository.findById(id).isEmpty()){
            taskRepository.deleteById(id);
            return true;
        }
        return false;

    }

    public Boolean deleteAll(){
        
            taskRepository.deleteAll();
            return true;

    }
}
