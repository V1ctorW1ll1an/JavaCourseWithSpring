package com.victor.course.resources;

import com.victor.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findALl() {
    User u = new User(1L, "Maria", "Maria@gmail.com", "3333333333", "123456");

    return ResponseEntity.ok().body(u);
  }
}
