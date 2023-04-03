package com.nonso.simpletodo.controller;

import com.nonso.simpletodo.dto.ApiResponse;
import com.nonso.simpletodo.dto.TaskDto;
import com.nonso.simpletodo.entity.Task;
import com.nonso.simpletodo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<ApiResponse> createTask(@RequestBody TaskDto taskDto) {
        return new ResponseEntity<>(new ApiResponse(true, "to-do created", taskService.createTask(taskDto)), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<ApiResponse> getAllToDOLists() {
        List<Task> todoList = taskService.getAllTodos();
        return new ResponseEntity<>(new ApiResponse(true, "to-do lists retrieved", todoList), HttpStatus.OK);
    }

}
