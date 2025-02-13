package com.rest.repository;


import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import com.rest.domain.Quote; 

@Repository
public interface QuoteRepo extends CrudRepository<Quote, Long> {
}

