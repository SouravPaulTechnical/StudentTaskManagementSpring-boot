package com.example.StudentTaskManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentTaskManagement.model.Task;
import com.example.StudentTaskManagement.repository.TaskRepository;

@Service
public class TaskServices {
    
    @Autowired
    private TaskRepository taskRepository;
    
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public void addTask(String taskTitle){
        Task task = new Task();
        task.setTaskTitle(taskTitle);
        task.setTaskCompleted(false);
        taskRepository.save(task);
    }

    public void markedAsCompleted(int taskId){
        Task task = taskRepository.findById(taskId).orElse(null);
        if (task !=null) {
            task.setTaskCompleted(true);
            taskRepository.save(task);
        }
    }

    public void removeTask(int taskId){
        taskRepository.deleteById(taskId);
    }
}
