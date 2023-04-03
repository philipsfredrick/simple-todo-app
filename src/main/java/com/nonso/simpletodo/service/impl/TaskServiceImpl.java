package com.nonso.simpletodo.service.impl;

import com.nonso.simpletodo.dto.TaskDto;
import com.nonso.simpletodo.entity.Task;
import com.nonso.simpletodo.repository.TaskRepository;
import com.nonso.simpletodo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public Task createTask(TaskDto taskDto) {
        Task task = Task
                .builder()
                .taskName(taskDto.getTaskName())
                .taskDate(LocalDateTime.now())
                .status(taskDto.getStatus())
                .build();

        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTodos() {
        return taskRepository.findAll();
    }
}
