package com.example.StudentTaskManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentTaskManagement.model.Task;

public interface TaskRepository extends JpaRepository <Task, Integer> {

}
