package com.example.TaskApp.mapper.impl;

import com.example.TaskApp.domain.CreateTaskRequest;
import com.example.TaskApp.domain.UpdateTaskRequest;
import com.example.TaskApp.domain.dto.CreateTaskRequestDto;
import com.example.TaskApp.domain.dto.TaskDto;
import com.example.TaskApp.domain.dto.UpdateTaskRequestDto;
import com.example.TaskApp.domain.entity.Task;
import com.example.TaskApp.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto)
    {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task)
    {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }

    @Override
    public UpdateTaskRequest fromDto(UpdateTaskRequestDto dto)
    {
        return new UpdateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.status(),
                dto.priority()
        );
    }

}
