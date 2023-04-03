package com.nonso.simpletodo.service;

import com.nonso.simpletodo.dto.TaskDto;
import com.nonso.simpletodo.entity.Task;

import java.util.List;

public interface TaskService {

    // create a task
    Task createTask(TaskDto taskDto);

    // list all todos
    List<Task> getAllTodos();


}
