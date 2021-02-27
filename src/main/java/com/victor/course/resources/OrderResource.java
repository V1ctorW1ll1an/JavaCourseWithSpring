package com.victor.course.resources;

import java.util.List;

import com.victor.course.entities.Order;
import com.victor.course.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

  // userService dependency
  @Autowired
  private OrderService orderService;

  @GetMapping
  public ResponseEntity<List<Order>> findALl() {
    List<Order> orders = orderService.findAll();

    return ResponseEntity.ok().body(orders);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Order> findOrderById(@PathVariable Long id) {
    Order order = orderService.findOrderById(id);

    return ResponseEntity.ok().body(order);
  }
}
