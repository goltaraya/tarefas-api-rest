package com.yagoinc.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagoinc.tarefas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
