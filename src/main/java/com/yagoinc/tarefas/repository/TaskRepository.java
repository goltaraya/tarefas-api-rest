package com.yagoinc.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagoinc.tarefas.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
