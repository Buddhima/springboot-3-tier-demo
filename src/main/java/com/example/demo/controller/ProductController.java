package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) throws Exception {

        return productService.getProductById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) throws Exception{

        productService.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() throws Exception {
        return productService.getAllProducts();
    }
}
