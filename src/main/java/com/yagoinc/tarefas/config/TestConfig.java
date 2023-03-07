package com.yagoinc.tarefas.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.yagoinc.tarefas.entities.Task;
import com.yagoinc.tarefas.entities.User;
import com.yagoinc.tarefas.repository.TaskRepository;
import com.yagoinc.tarefas.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Yago Alexandre", "yago@gmail.com", "98983090786", "12345");
		User u2 = new User(null, "Juliana Reis", "juliana@gmail.com", "98983020092", "12345");
		User u3 = new User(null, "Luiz Fellipe", "luiz@gmail.com", "98983099036", "12345");

		userRepository.saveAll(Arrays.asList(u1, u2, u3));

		Task t1 = new Task(null, "Configurar página inicial - Estágio",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit.", u1);
		Task t2 = new Task(null, "Listar plugins para remoção - Estágio",
				"Vestibulum eget iaculis lorem, vitae tincidunt nunc.", u1);
		Task t3 = new Task(null, "Levar Brad para passear - Casa", "Fusce tristique consequat cursus.", u3);

		taskRepository.saveAll(Arrays.asList(t1, t2, t3));
	}

}
