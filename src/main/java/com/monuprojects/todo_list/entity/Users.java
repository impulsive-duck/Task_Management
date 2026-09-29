package com.monuprojects.todo_list.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    @Column(nullable=false) // nullable = false prevents NULL,
    // but it does not prevent an empty string "".
    // If you also want to reject empty/blank names at the
    // application-validation level, you'd use something like @NotBlank.

    private String password;

}