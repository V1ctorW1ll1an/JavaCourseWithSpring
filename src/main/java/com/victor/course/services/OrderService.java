package com.victor.course.services;

import java.util.List;
import java.util.Optional;

import com.victor.course.entities.Order;
import com.victor.course.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  // OrderRepository dependency
  @Autowired
  private OrderRepository orderRepository;

  public List<Order> findAll() {
    return orderRepository.findAll();
  }

  public Order findOrderById(Long id) {
    Optional<Order> obj = orderRepository.findById(id);
    return obj.get();
  }
}
