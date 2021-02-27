package com.victor.course.repositories;

import com.victor.course.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

// entity and type of id
public interface OrderRepository extends JpaRepository<Order, Long> {

}
