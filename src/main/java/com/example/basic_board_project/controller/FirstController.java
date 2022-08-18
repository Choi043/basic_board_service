package com.example.basic_board_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/greetings")
    public String testGreetings(Model model) {
        model.addAttribute("username", "Choi");
        return "greetings";
    }
}
