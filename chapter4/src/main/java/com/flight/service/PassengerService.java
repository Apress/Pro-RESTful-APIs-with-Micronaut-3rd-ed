package com.rest.service;

import com.rest.domain.Passenger;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Singleton;
@Singleton
public class PassengerService {
static private Map<Integer, Passenger> passengerRepo = new HashMap<Integer, Passenger>();
static private AtomicInteger idCounter = new AtomicInteger();
public Passenger getPassenger(int id) {
	Passenger passenger = passengerRepo.get(id);
	return passenger;
}
public  List<Passenger> getPassengers() {
   return new ArrayList<Passenger>(passengerRepo.values());
}
}

