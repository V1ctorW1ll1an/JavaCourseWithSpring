package com.victor.course.resources;

import java.util.List;

import com.victor.course.entities.Category;
import com.victor.course.entities.Order;
import com.victor.course.services.CategoryService;
import com.victor.course.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

  // userService dependency
  @Autowired
  private CategoryService categoryService;

  @GetMapping
  public ResponseEntity<List<Category>> findALl() {
    List<Category> categories = categoryService.findAll();

    return ResponseEntity.ok().body(categories);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Category> findCategoryById(@PathVariable Long id) {
    Category category = categoryService.findCategoryById(id);

    return ResponseEntity.ok().body(category);
  }
}
