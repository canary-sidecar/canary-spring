package observability.canary.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import observability.canary.api.dto.TodoEntity;
import observability.canary.api.repository.TodoMapper;


@Service
public class TodoService {
  final TodoMapper todoMapper;

  public TodoService(TodoMapper todoMapper) {
    this.todoMapper = todoMapper;
  }

  public List<TodoEntity> getTodos() {
    return todoMapper.findAll();
  }

  public void createTable() {
    todoMapper.createTable();
  }

  public TodoEntity findById(Integer id) {
    return todoMapper.findById(id);
  }

  public void insert(TodoEntity todo) {
    todoMapper.insert(todo);
  }
}
