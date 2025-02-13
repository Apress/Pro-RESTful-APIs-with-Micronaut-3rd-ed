package com.rest.controllers;

import com.rest.model.Message;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Produces;

@Controller("/message")  // <2>
public class MessageController {

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
    public HttpResponse<?> messageJson() {
        Message message = new Message();
        message.setMessage("Hello from Micronaut");
        return HttpResponse.ok(message);
    }

    private String encodeAsXml(final Message message) {
        return String.format("<message>%s</message>", message.getMessage());
    }


}

