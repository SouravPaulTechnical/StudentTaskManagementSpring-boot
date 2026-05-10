package com.example.StudentTaskManagement.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int taskId;
    private String taskTitle;
    private boolean taskCompleted;

    public Task(){}

    public Task(int taskId, String taskTitle, boolean taskCompleted){
        this.taskId=taskId;
        this.taskTitle=taskTitle;
        this.taskCompleted=taskCompleted;
    }

    public int getTaskId(){
        return taskId;
    }
    public void setTaskId(int taskId){
        this.taskId=taskId;
    }

    public String getTaskTitle(){
        return taskTitle;
    }
    public void setTaskTitle(String taskTitle){
        this.taskTitle=taskTitle;
    }

    public boolean getTaskCompleted(){
        return taskCompleted;
    }
    public void setTaskCompleted(boolean taskCompleted){
        this.taskCompleted=taskCompleted;
    }
}
