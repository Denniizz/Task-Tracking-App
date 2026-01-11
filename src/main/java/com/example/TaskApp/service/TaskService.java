package com.example.TaskApp.service;

import com.example.TaskApp.domain.CreateTaskRequest;
import com.example.TaskApp.domain.UpdateTaskRequest;
import com.example.TaskApp.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);

    void deleteTask(UUID taskId);
}
