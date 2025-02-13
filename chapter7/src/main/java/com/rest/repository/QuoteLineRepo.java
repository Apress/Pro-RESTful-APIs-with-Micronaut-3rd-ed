package com.rest.repository;


import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import com.rest.domain.QuoteLine;; 

@Repository
public interface QuoteLineRepo extends CrudRepository<QuoteLine, Long> {
}

