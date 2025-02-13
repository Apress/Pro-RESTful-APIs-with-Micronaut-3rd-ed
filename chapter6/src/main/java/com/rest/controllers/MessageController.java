package com.rest.controllers;

import com.rest.model.Message;
import com.rest.service.MessageService;
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

@Controller("/message")  // <2>
public class MessageController {

  MessageService messageService;
  public MessageController(MessageService messageService) { // <3>
      this.messageService = messageService;
  }
  @Produces(MediaType.TEXT_XML)
  @Get("/xml")
    public HttpResponse<?> messageXml() {
        Message message = new Message();
        message.setMessage("Hello from Micronaut");
        final String xml = encodeAsXml(message);
        return HttpResponse.ok(xml).contentType(MediaType.APPLICATION_XML_TYPE);
    }
  @Produces(MediaType.TEXT_JSON)
  @Get("/json")
    public Message messageJson() {
        Message message = new Message();
        message.setMessage("Hello from Micronaut");
        return message;
    }
    private String encodeAsXml(final Message message) {
        return String.format("<message>%s</message>", message.getMessage());
    }

    @Post
    public Message createMessage(@Body Message message) {
       messageService.createMessage(message);
       return message;
    }

   @Get("/{id}")
   public Message getMessage (int id)    {
     Message message = messageService.getMessage(id);
     return message;
   }
   @Get
   public List<Message> getMessages() {
      List<Message> messages = messageService.getMessages();
      return messages;
   }
   @Put("/{id}")
   public void updateMessage (int id, @Body Message update) {
      messageService.updateMessage(id, update);
   }
   @Delete("/{id}")
   public void deleteMessage(int id) {
      messageService.deleteMessage(id);
   }
}

