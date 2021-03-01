package com.victor.course.resources;

import java.util.List;

import com.victor.course.entities.Category;
import com.victor.course.entities.Product;
import com.victor.course.services.CategoryService;
import com.victor.course.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

  // userService dependency
  @Autowired
  private ProductService productService;

  @GetMapping
  public ResponseEntity<List<Product>> findALl() {
    List<Product> products = productService.findAll();

    return ResponseEntity.ok().body(products);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Product> findProductById(@PathVariable Long id) {
    Product product = productService.findProductById(id);

    return ResponseEntity.ok().body(product);
  }
}
