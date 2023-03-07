package com.yagoinc.tarefas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yagoinc.tarefas.entities.Task;
import com.yagoinc.tarefas.service.TaskService;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {

	@Autowired
	private TaskService service;

	@GetMapping
	public ResponseEntity<List<Task>> findAll() {
		List<Task> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Task> findById(@PathVariable Long id) {
		Task obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
