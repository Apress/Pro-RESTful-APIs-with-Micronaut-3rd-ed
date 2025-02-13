package com.rest.domain;
import io.swagger.v3.oas.annotations.media.Schema;
@Schema(description="Flight")
public class Flight {
 private String id;
 private String departure;
 private String origin;
 private String destination;

 public String getId() {
        return id;
 }
 public void setId(String id) {
     this.id = id;
 }
 public String getDeparture() {
        return departure;
 }
 public void setDeparture(String departure) {
     this.departure = departure;
 }
 public String getOrigin() {
        return origin;
 }
 public void setOrigin(String origin) {
     this.origin = origin;
 }
 public String getDestination() {
        return destination;
 }
 public void setDestination(String destination) {
     this.destination = destination;
 }
}

