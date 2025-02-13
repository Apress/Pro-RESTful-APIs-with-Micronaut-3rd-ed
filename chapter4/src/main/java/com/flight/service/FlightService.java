package com.rest.service;

import com.rest.domain.Flight;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Singleton;
@Singleton
public class FlightService {
static private Map<Integer, Flight> flightRepo = new HashMap<Integer, Flight>();
static private AtomicInteger idCounter = new AtomicInteger();
public Flight getFlight(String id) {
	Flight flight = flightRepo.get(id);
	return flight;
}
public  List<Flight> getFlightsByPassenger(String passengerId) {
   return new ArrayList<Flight>(flightRepo.values());
}
}

