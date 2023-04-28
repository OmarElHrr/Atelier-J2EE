package com.example.projet_mo.service;


import com.example.projet_mo.model.Message;
import com.example.projet_mo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMessage {
    @Autowired
    MessageRepository messageRepository ;

    public Message saveMessage(Message message) {
        Message savedmessage = messageRepository.save(message);
        return savedmessage;
    }
}
