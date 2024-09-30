package com.jpa.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.model.Product;
import com.jpa.test.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/products")
public class ProductController {
  
	
	@Autowired
    private ProductService productService;
	
	  @PostMapping
	    public ResponseEntity<Product> createProduct(@RequestBody String email) {
	        Product newProduct = productService.createProductWithEmail(email);
	        return ResponseEntity.ok(newProduct);
	    }
	
}
