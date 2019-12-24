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

}
