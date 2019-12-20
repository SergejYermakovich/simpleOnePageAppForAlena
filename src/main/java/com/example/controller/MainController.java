package com.example.controller;


import com.example.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String messages(Model model) {

        List<Message> messages = Arrays.asList(
                new Message(1, "plz, go away!!!"),
                new Message(2, "just do it!!!"),
                new Message(3, "keep calm !!!"));

        model.addAttribute("messages", messages);
        return "index";
    }

}
