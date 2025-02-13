package com.rest.service;
  
import com.rest.model.Message;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Singleton;
@Singleton
public class MessageService {
static private Map<Integer, Message> messageRepo = new HashMap<Integer, Message>();
static private AtomicInteger idCounter = new AtomicInteger();
public Message getMessage(int id) {
        Message message = messageRepo.get(id);
        return message;
}
// add message
public void createMessage(Message message) {
        message.setId(idCounter.incrementAndGet());
        messageRepo.put(message.getId(), message);
}
// update message
public void updateMessage(int id, Message update) {
        Message current = messageRepo.get(id);
        current.setMessage(update.getMessage());
        current.setFrom(update.getFrom());
        current.setTo(update.getTo());
        current.setCreationDate(update.getCreationDate());
        messageRepo.put(current.getId(), current);
}
// Delete message
public void deleteMessage(int id) {
        Message current = messageRepo.remove(id);
}
public  List<Message> getMessages() {
   return new ArrayList<Message>(messageRepo.values());
}
}
