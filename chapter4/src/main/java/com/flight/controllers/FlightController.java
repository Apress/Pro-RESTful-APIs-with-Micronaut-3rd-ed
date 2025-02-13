package com.rest.controller;

import com.rest.domain.Flight;
import com.rest.service.FlightService;
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

@Controller("/flight")  // <2>
public class FlightController {

  FlightService flightService;
  public FlightController(FlightService flightService) { // <3>
      this.flightService = flightService;
  }
    
   @Get("/{id}") 
   public Flight getFlight(String id)    {
     Flight flight = flightService.getFlight(id);
     return flight;
   }
   @Get("/passenger/{id}")
   public List<Flight> getFlightsByPassenger(String id) {
      List<Flight> flights = flightService.getFlightsByPassenger(id);
      return flights;
   }
}
