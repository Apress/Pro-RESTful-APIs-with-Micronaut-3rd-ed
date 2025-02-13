package com.rest.domain;
import io.swagger.v3.oas.annotations.media.Schema;
@Schema(description="Passenger")
public class Passenger {
 private String id;
 private String name;

 public String getId() {
        return id;
 }
 public void setId(String id) {
     this.id = id;
 }
 public String getName() {
        return name;
 }
 public void setName(String name) {
     this.name = name;
 }
}
