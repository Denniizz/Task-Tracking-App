package com.example.TaskApp.domain;

import com.example.TaskApp.domain.entity.TaskPriority;
import com.example.TaskApp.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority
) {
}
