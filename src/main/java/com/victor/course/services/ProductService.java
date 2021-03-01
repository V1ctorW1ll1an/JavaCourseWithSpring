package com.victor.course.services;

import java.util.List;
import java.util.Optional;

import com.victor.course.entities.Product;
import com.victor.course.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  // OrderRepository dependency
  @Autowired
  private ProductRepository productRepository;

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Product findProductById(Long id) {
    Optional<Product> obj = productRepository.findById(id);
    return obj.get();
  }
}
