package com.mccoy.smalltalk.controller;

import com.mccoy.smalltalk.model.TalkingPoint;
import com.mccoy.smalltalk.service.TalkingPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @Autowired
    TalkingPointService talkingPointService;

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        TalkingPoint point = talkingPointService.getRandom();
        model.addAttribute("talkingPoint", point.getName());
        model.addAttribute("appName", appName);
        return "home";
    }

}
