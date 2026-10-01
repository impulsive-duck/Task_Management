package com.monuprojects.todo_list.controller;

import com.monuprojects.todo_list.payload.Userdto;
import com.monuprojects.todo_list.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // store user in the db
    @PostMapping("/register")
    public ResponseEntity<Userdto> createUser(@RequestBody Userdto userDto)
    {
       return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.CREATED);
    }
}

