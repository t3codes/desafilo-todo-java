package br.com.tharlleste.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.tharlleste.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    // Aqui você pode adicionar métodos personalizados se necessário
}
