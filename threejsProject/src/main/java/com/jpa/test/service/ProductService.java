package com.jpa.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.dao.ProductRepository;
import com.jpa.test.model.Product;

@Service
public class ProductService {
	
	   @Autowired
	    private ProductRepository productRepository;
	
	// Create a new product with email
	    public Product createProductWithEmail(String email) {
	        Product product = new Product();
	        product.setEmail(email);
	        return productRepository.save(product);
	    }

}
