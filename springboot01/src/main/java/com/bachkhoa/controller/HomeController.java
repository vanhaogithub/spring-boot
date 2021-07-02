package com.bachkhoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	@GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
    
    @GetMapping("/403")
    public String accessDenied() {
        return "403Page";
    }
    
    @GetMapping("/admin")
    public String goToAdmin() {
        return "admin";
    }
    
    @GetMapping("/register")
    public String registration() {
        return "registration";
    }
}

