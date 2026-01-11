package com.example.TaskApp.domain.dto;

import com.example.TaskApp.domain.entity.TaskPriority;
import com.example.TaskApp.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
