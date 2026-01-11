package com.example.TaskApp.domain.dto;


import com.example.TaskApp.domain.entity.TaskPriority;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

public record CreateTaskRequestDto(
        @NotBlank(message = ERROR_MESSAGE_TITLE_LENGTH)
        @Length(max=255, message = ERROR_MESSAGE_TITLE_LENGTH)
        String title,
        @Length(max=1000, message = "Description must be less than 1000 characters")
        @Nullable
        String description,
        @FutureOrPresent(message = "Due date must be in the future")
        @Nullable
        LocalDate dueDate,
        @NotNull(message = "Task priority must be provided")
        TaskPriority priority
) {
    private static final String ERROR_MESSAGE_TITLE_LENGTH =
    "Title must be between 1 and 255 characters";
}
