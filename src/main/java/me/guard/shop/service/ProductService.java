package me.guard.shop.service;

import lombok.RequiredArgsConstructor;
import me.guard.shop.dto.ProductRequestDto;
import me.guard.shop.dto.ProductResponseDto;
import me.guard.shop.entity.Product;
import me.guard.shop.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }
}
