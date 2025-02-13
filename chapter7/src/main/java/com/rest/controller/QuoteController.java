package com.rest.controller;

import com.rest.domain.Quote;
import com.rest.repository.QuoteRepo;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.Body;
import java.util.List;
import java.util.ArrayList;
@Controller("/quote")  // <2>
public class QuoteController {

  QuoteRepo quoteRepo;
  public QuoteController(QuoteRepo quoteRepo) { // <3>
      this.quoteRepo = quoteRepo;
  }
  @Post
  public Quote createQuote(@Body Quote quote) {
       return quoteRepo.save(quote);
  }
    
  @Get("/{id}") 
  public Quote getQuote (Long id)    {
     Quote quote = quoteRepo.findById(id).get();
     return quote;
   }
   @Get
   public List<Quote> getQuotes() {
      Iterable<Quote> quotes =  quoteRepo.findAll();
      List<Quote> result = new ArrayList<Quote>();
      quotes.forEach(result::add);
      return result;
   }
   @Put("/{id}") 
   public void updateQuote (Long id, Quote update) {
      Quote quote = quoteRepo.findById(id).get();
      quoteRepo.delete(quote);
      quoteRepo.save(update);
   }
   @Delete("/{id}") 
   public void deleteQuote(Long id) {
      Quote quote = quoteRepo.findById(id).get();
      quoteRepo.delete(quote);
   }
}

