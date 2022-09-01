package com.konopackipio1.controllers;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    // Using REQUEST PARAMETERS
    @RequestMapping("/home")
    public String home(Model page, @RequestParam String color, @RequestParam String username) {
        page.addAttribute("username", username);
        page.addAttribute("color", color);

        return "home.html";
    }

    // Using PATH VARIABLES
    @RequestMapping("/home/{username}")
    public String homeWithVariable(Model page, @PathVariable String username) {
        page.addAttribute("username", username);
        page.addAttribute("color", "black");

        return "home.html";
    }

}
