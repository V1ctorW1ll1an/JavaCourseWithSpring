package com.victor.course.services;

import java.util.List;
import java.util.Optional;

import com.victor.course.entities.Category;
import com.victor.course.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

  // OrderRepository dependency
  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> findAll() {
    return categoryRepository.findAll();
  }

  public Category findCategoryById(Long id) {
    Optional<Category> obj = categoryRepository.findById(id);
    return obj.get();
  }
}
