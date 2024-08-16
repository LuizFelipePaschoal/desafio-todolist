package br.com.felipepaschoaldev.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipepaschoaldev.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}