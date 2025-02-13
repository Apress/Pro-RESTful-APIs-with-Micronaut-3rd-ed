package com.rest.model;
import io.micronaut.serde.annotation.Serdeable;
@Serdeable // (1)
public class Message {
 private int id;
 private String message;
 private String from;
 private String to;
 private String creationDate;

 public String getMessage() {
        return message;
 }
 public void setMessage(String message) {
     this.message = message;
 }
 public String getFrom() {
        return from;
 }
 public void setFrom(String from) {
     this.from = from;
 }
 public String getTo() {
        return to;
 }
 public void setTo(String to) {
     this.to = to;
 }
 public String getCreationDate() {
        return creationDate;
 }
 public void setCreationDate(String creationDate) {
     this.creationDate = creationDate;
 }
 public int getId() {
        return id;
 }
 public void setId(int id) {
     this.id = id;
 }
}

