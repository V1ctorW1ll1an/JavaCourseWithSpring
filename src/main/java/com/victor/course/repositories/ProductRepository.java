package com.victor.course.repositories;

import com.victor.course.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

// entity and type of id
public interface ProductRepository extends JpaRepository<Product, Long> {

}
