package com.monuprojects.todo_list.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tasks {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false)
    private String taskname;

    @ManyToOne(fetch=FetchType.EAGER) // no need to fetch immediately
    private Users user;
}
