package com.victor.course.config;

import java.time.Instant;
import java.util.Arrays;

import com.victor.course.entities.Category;
import com.victor.course.entities.Order;
import com.victor.course.entities.Product;
import com.victor.course.entities.User;
import com.victor.course.entities.enums.OrderStatus;
import com.victor.course.repositories.CategoryRepository;
import com.victor.course.repositories.OrderRepository;
import com.victor.course.repositories.ProductRepository;
import com.victor.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  // injection
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private OrderRepository OrderRepository;

  @Autowired
  private CategoryRepository categoryRepository;

  @Autowired
  private ProductRepository productRepository;

  @Override
  public void run(String... args) throws Exception {
    // Executar quando a aplicação for iniciada
    Category cat1 = new Category(null, "Electronics");
    Category cat2 = new Category(null, "Books");
    Category cat3 = new Category(null, "Computers");

    Product p1 = new Product(null, "The Lord of the Rings", "Um livro muito bom", 90.5, "");
    Product p2 = new Product(null, "Smart TV", "Uma tv enorme.", 2190.0, "");
    Product p3 = new Product(null, "Macbook Pro", "O linux é melhor", 1250.0, "");
    Product p4 = new Product(null, "PC Gamer", "O titulo 'Gamer' aumenta o preço em 1000.", 1200.0, "");
    Product p5 = new Product(null, "Caderno do homem aranha", "O melhor caderno que existe.", 100.99, "");

    categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

    User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
    User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

    Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
    Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
    Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

    userRepository.saveAll(Arrays.asList(u1, u2));
    OrderRepository.saveAll(Arrays.asList(o1, o2, o3));

  }

}
