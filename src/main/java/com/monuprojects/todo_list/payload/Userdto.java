package com.monuprojects.todo_list.payload;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

public class Userdto {

    private long id;
    private String name;
    private String email;
    private String password;
}
