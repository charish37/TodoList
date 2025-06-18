package com.java.projects.todo.services;

import com.java.projects.todo.models.Task;
import com.java.projects.todo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
       return taskRepository.findAll();
    }
}
