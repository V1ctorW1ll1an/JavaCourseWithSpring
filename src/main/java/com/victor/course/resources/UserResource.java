package com.victor.course.resources;

import java.util.List;

import com.victor.course.entities.User;
import com.victor.course.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  // userService dependency
  @Autowired
  private UserService userService;

  @GetMapping
  public ResponseEntity<List<User>> findALl() {
    List<User> users = userService.findAll();

    return ResponseEntity.ok().body(users);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<User> findUserById(@PathVariable Long id) {
    User user = userService.findUserById(id);

    return ResponseEntity.ok().body(user);
  }
}
