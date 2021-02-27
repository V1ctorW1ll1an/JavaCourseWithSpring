package com.victor.course.repositories;

import com.victor.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

// entity and type of id
public interface UserRepository extends JpaRepository<User, Long> {

}
