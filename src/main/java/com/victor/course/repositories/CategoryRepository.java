package com.victor.course.repositories;

import com.victor.course.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

// entity and type of id
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
