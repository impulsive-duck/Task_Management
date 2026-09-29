package com.monuprojects.todo_list.repository;

import com.monuprojects.todo_list.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
