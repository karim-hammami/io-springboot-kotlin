package com.example.io.controllers

import com.example.io.model.Todo
import com.example.io.repository.TodoCollectionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/todo")
class todoController {

    @Autowired
    lateinit var repository: TodoCollectionRepository


    @GetMapping
    fun findAll(): List<Todo> {
        return repository.findAll()
    }


    @PostMapping
    fun create(@RequestBody todo: Todo): Todo {
        return repository.create(todo)
    }
}