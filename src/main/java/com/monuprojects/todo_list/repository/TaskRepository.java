package com.monuprojects.todo_list.repository;

import com.monuprojects.todo_list.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Tasks,Long> {
}
