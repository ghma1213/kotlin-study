package com.hooney.kotlinstudy.service

import com.hooney.kotlinstudy.data.dto.TodoDto
import com.hooney.kotlinstudy.data.entity.Todo
import com.hooney.kotlinstudy.data.repository.TodoRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class TodoService @Autowired constructor (
    val todoRepository: TodoRepository,
    val modelMapper: ModelMapper) {

    fun selectTodo(): List<Todo> {
        return todoRepository.findAll()
    }

    @Transactional
    fun insertTodo(todoDto: TodoDto): Int {
        val save = todoRepository.save(modelMapper.map(todoDto, Todo::class.java))
        return save.id
    }


}