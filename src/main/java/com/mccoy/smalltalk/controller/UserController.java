package com.mccoy.smalltalk.controller;

import com.mccoy.smalltalk.repository.UserRepository;
import com.mccoy.smalltalk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {

@Value("${spring.application.name}")
String appName;

@Autowired
UserService userService;

    @GetMapping("/user/{name}")
    public String createUser(Model model, @PathVariable String name) {
        userService.create(name);
        model.addAttribute("appName", appName);
        model.addAttribute("feedback", "New user created name: " + name);
        return "home";
    }

    @GetMapping("/listusers")
    public String listUsers(Model model) {
        userService.getAllUsers();
        model.addAttribute("users", userService.getAllUsers());
        return "listusers";
    }




}
