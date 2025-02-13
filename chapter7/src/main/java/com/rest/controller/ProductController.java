package com.rest.controller;

import com.rest.domain.Product;
import com.rest.repository.ProductRepo;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.Body;
import java.util.List;
import java.util.ArrayList;


@Controller("/product")  // <2>
public class ProductController {

  ProductRepo productRepo;
  public ProductController(ProductRepo productRepo) { // <3>
      this.productRepo = productRepo;
  }
  @Post
  public Product createProduct(@Body Product product) {
       return productRepo.save(product);
  }
    
  @Get("/{id}") 
  public Product getProduct (Long id)    {
     Product product = productRepo.findById(id).get();
     return product;
   }
   @Get
   public List<Product> getProducts() {
      Iterable<Product> products =  productRepo.findAll();
      List<Product> result = new ArrayList<Product>();
      products.forEach(result::add);
      return result;
   }
   @Put("/{id}") 
   public void updateProduct (Long id, Product update) {
      Product product = productRepo.findById(id).get();
      productRepo.delete(product);
      productRepo.save(update);
   }
   @Delete("/{id}") 
   public void deleteProduct(Long id) {
      Product product = productRepo.findById(id).get();
      productRepo.delete(product);
   }
}

