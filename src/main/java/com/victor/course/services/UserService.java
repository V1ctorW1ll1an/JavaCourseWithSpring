package com.victor.course.services;

import java.util.List;
import java.util.Optional;

import com.victor.course.entities.User;
import com.victor.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  // UserRepository dependency
  @Autowired
  private UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User findUserById(Long id) {
    Optional<User> obj = userRepository.findById(id);
    return obj.get();
  }
}
