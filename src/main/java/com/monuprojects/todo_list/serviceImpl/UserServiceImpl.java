package com.monuprojects.todo_list.serviceImpl;

import com.monuprojects.todo_list.entity.Users;
import com.monuprojects.todo_list.payload.Userdto;
import com.monuprojects.todo_list.repository.UserRepository;
import com.monuprojects.todo_list.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public Userdto createUser(Userdto userDto) {
        // userDto not an entity it is DTO
        Users users = userDTOtoEntity(userDto);

        Users savedUser = userRepo.save(users);
        return entityToUserDto(savedUser);
    }

    private Users userDTOtoEntity(Userdto userDto) {
        Users users = new Users();
        users.setName(userDto.getName());
        users.setEmail(userDto.getEmail());
        users.setPassword(userDto.getPassword());


        return users;

    }

    private Userdto entityToUserDto(Users savedUser) {
        Userdto userDto = new Userdto();
        userDto.setId(savedUser.getId());
        userDto.setName(savedUser.getName());
        userDto.setEmail(savedUser.getEmail());

        userDto.setPassword(savedUser.getPassword());

        return userDto;

    }

}
