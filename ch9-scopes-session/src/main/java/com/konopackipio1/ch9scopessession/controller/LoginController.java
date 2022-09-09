package com.konopackipio1.ch9scopessession.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.konopackipio1.ch9scopessession.LoginProcessor;
import com.konopackipio1.ch9scopessession.services.LoggedUserManagementService;

@Controller
public class LoginController {

    private final LoggedUserManagementService loggedUserManagementService;

    public LoginController(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(Model model, @RequestParam String username, @RequestParam String password) {

        LoginProcessor loginProcessor = new LoginProcessor(loggedUserManagementService);
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean loggedIn = loginProcessor.login();

        if (loggedIn) {
            return "redirect:/main";
        } else {
            model.addAttribute("message", "User not logged in");
        }

        return "login.html";
    }

}
