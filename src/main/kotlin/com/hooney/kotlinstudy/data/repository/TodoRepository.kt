package com.hooney.kotlinstudy.data.repository

import com.hooney.kotlinstudy.data.dto.TodoDto
import com.hooney.kotlinstudy.data.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository: JpaRepository<Todo, Int> {

}