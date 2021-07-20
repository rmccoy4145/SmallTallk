package com.mccoy.smalltalk.controller;

import com.mccoy.smalltalk.model.User;
import com.mccoy.smalltalk.repository.UserRepository;
import com.mccoy.smalltalk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

@Value("${spring.application.name}")
String appName;

@Autowired
UserService userService;

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register")
    public String createUser(@ModelAttribute("user") User user, Model model) {
        userService.create(user);
        model.addAttribute("feedback", "New user created name: " + user.getName());
        return "register";
    }

    @GetMapping("/listusers")
    public String listUsers(Model model) {
        userService.getAllUsers();
        model.addAttribute("users", userService.getAllUsers());
        return "listusers";
    }




}
