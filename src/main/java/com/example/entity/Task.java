package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
    
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status; 

    public Task(){this.id = "";}

    public Task(String id, String title, String description, String status)
    {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public String getId(){ return this.id;}
    public String getTitle(){ return this.title;}
    public String getDescription(){ return this.description;}
    public String getStatus(){ return this.status;}

    public void setId(String id){ this.id = id;}
    public void setTitle(String title){ this.title = title;}
    public void setDescription(String description){ this.description = description;}
    public void setStatus(String status){ this.status = status;}    
}
