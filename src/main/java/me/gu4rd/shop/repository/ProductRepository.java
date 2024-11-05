package me.gu4rd.shop.repository;

import me.gu4rd.shop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
