package com.rest.controller;

import com.rest.domain.Passenger;
import com.rest.service.PassengerService;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Controller;


import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.Body;
import java.util.List;

@Controller("/passenger")  // <2>
public class PassengerController {

  PassengerService passengerService;
  public PassengerController(PassengerService passengerService) { // <3>
      this.passengerService = passengerService;
  }
    
   @Get("/{id}") 
   public Passenger getPassenger (int id)    {
     Passenger passenger = passengerService.getPassenger(id);
     return passenger;
   }
   @Get
   public List<Passenger> getPassengers() {
      List<Passenger> passengers = passengerService.getPassengers();
      return passengers;
   }
}
