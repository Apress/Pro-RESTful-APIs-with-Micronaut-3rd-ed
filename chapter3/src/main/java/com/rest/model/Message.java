package com.rest.model;
import io.micronaut.serde.annotation.Serdeable;


@Serdeable // (1)
public class Message {
 private String message;
 public String getMessage() {
        return message;
 }
 public void setMessage(String message) {
     this.message = message;
 }
}
