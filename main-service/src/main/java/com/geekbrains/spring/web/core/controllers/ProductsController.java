package com.geekbrains.spring.web.core.controllers;

import com.geekbrains.spring.web.core.services.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductsController {
    private final ProductsService productsService;

//    @GetMapping
//    public Page<ProductDto> getAllProducts(
//            @RequestParam(name = "p", defaultValue = "1") Integer page,
//            @RequestParam(name = "min_price", required = false) Integer minPrice,
//            @RequestParam(name = "max_price", required = false) Integer maxPrice,
//            @RequestParam(name = "title_part", required = false) String titlePart
//    ) {
//        if (page < 1) {
//            page = 1;
//        }
//        return productsService.findAll(minPrice, maxPrice, titlePart, page).map(
//                p -> productConverter.entityToDto(p)
//        );
//    }
//
//    @GetMapping("/{id}")
//    public ProductDto getProductById(
//            @PathVariable @Parameter(description = "Идентификатор продукта", required = true) Long id
//    ) {
//        Product product = productsService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found, id: " + id));
//        return productConverter.entityToDto(product);
//    }
//
//    @PostMapping
//    public ProductDto saveNewProduct(@RequestBody ProductDto productDto) {
//        productValidator.validate(productDto);
//        Product product = productConverter.dtoToEntity(productDto);
//        product = productsService.save(product);
//        return productConverter.entityToDto(product);
//    }
//
//    @PutMapping
//    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
//        productValidator.validate(productDto);
//        Product product = productsService.update(productDto);
//        return productConverter.entityToDto(product);
//    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productsService.deleteById(id);
    }
}
