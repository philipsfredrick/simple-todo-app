package com.nonso.simpletodo.repository;

import com.nonso.simpletodo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {

    Optional<Task> findById(Long taskId);
}
