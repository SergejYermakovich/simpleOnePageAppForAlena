package com.example.service;

import com.example.dao.MessageDao;
import com.example.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageDao messageDao;

    public List<Message> listMessages() {
        return messageDao.findAll();
    }

    public void deleteById(int id) {
        messageDao.deleteById(id);
    }

    public Message save(Message message) {
       return messageDao.save(message);
    }

}
