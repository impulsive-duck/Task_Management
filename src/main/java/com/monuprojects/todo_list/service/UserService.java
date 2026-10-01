package com.monuprojects.todo_list.service;

import com.monuprojects.todo_list.payload.Userdto;
import org.springframework.stereotype.Service;

public interface UserService {
    public Userdto createUser(Userdto userDto);
}
