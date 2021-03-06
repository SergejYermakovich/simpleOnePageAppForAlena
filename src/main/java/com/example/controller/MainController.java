package com.example.controller;

import com.example.model.Message;
import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/delete/{id}")
    public String deleteMessage(@PathVariable int id) {
        messageService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Message message = new Message();
        model.addAttribute("newMessage", message);
        return "createNewMessage";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("newMessage") Message message) {
         messageService.save(message);
        return "redirect:/";
    }

}
