package com.example.StudentTaskManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.StudentTaskManagement.services.TaskServices;

@Controller
public class TaskController {
    
    @Autowired
    private TaskServices taskServices;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("tasks", taskServices.getAllTasks());
        return "index";
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String taskTitle){
        taskServices.addTask(taskTitle);
        return "redirect:/";
    }

    @GetMapping("/complete/{taskId}")
    public String taskMArkedAsCompleted(@PathVariable int taskId){
        taskServices.markedAsCompleted(taskId);
        return "redirect:/";
    }

    @GetMapping("/delete/{taskId}")
    public String deleteTask(@PathVariable int taskId){
        taskServices.removeTask(taskId);
        return "redirect:/";
    }

}
