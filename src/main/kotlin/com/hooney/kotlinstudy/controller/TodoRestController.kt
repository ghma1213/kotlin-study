package com.hooney.kotlinstudy.controller;

import com.hooney.kotlinstudy.service.TodoService;
import lombok.val;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TodoRestController (val todoService: TodoService) {

}
