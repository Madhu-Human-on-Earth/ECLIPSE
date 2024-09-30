package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
