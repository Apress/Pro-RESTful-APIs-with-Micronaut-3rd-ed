package com.rest.repository;


import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import com.rest.domain.Product; 

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
}

