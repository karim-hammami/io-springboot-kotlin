package com.example.io.repository

import com.example.io.model.Todo
import org.springframework.stereotype.Repository

@Repository
class TodoCollectionRepository {
    private lateinit var todoList: MutableList<Todo>


    fun findAll(): List<Todo> {
        return todoList
    }

    fun create(todo: Todo): Todo {
        todoList.add(todo)
        return todo
    }
}