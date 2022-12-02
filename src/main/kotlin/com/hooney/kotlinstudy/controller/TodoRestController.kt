package com.hooney.kotlinstudy.controller

import com.hooney.kotlinstudy.data.dto.TodoDto
import com.hooney.kotlinstudy.data.entity.Todo
import com.hooney.kotlinstudy.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class TodoRestController (private val todoService: TodoService) {

    @GetMapping("/todo")
    fun selectTodo(): List<Todo> {
        return todoService.selectTodo()
    }

    @PostMapping("/todo")
    fun insertTodo(@RequestBody todoDto: TodoDto): Int {
        return todoService.insertTodo(todoDto)
    }
}
