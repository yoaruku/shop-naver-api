package me.gu4rd.shop.repository;

import me.gu4rd.shop.entity.Product;
import me.gu4rd.shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUser(User user);
}
