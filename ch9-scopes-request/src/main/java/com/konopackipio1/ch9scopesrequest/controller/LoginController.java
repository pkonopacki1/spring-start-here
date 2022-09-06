package com.konopackipio1.ch9scopesrequest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.konopackipio1.ch9scopesrequest.LoginProcessor;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(Model model, @RequestParam String username, @RequestParam String password) {

        LoginProcessor loginProcessor = new LoginProcessor();
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean loggedIn = loginProcessor.login();

        if (loggedIn) {
            model.addAttribute("message", "User logged in");
        } else {
            model.addAttribute("message", "User not logged in");
        }

        return "login.html";
    }

}
