package com.example.controller;

import com.example.model.Message;
import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    MessageService messageService;

    @GetMapping("/")
    public String listMessages(Model model) {
        List<Message> messages = messageService.listMessages();
        model.addAttribute("messages", messages);
        return "index";
    }
}
