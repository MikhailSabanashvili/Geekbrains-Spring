package com.example.geekbrainsspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping(value = "/start")
    public String hello(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "index";
    }

}