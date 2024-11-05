package me.guard.shop.controller;

import lombok.RequiredArgsConstructor;
import me.guard.shop.dto.ProductMypriceRequestDto;
import me.guard.shop.dto.ProductRequestDto;
import me.guard.shop.dto.ProductResponseDto;
import me.guard.shop.entity.Product;
import me.guard.shop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/shop")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto) {
        return productService.createProduct(requestDto);
    }

    @PutMapping("/products/{id}")
    public ProductResponseDto updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto) {
        return productService.updateProduct(id, requestDto);
    }

    @GetMapping("/products")
    public List<ProductResponseDto> getProducts() {
        return productService.getProducts();
    }
}
