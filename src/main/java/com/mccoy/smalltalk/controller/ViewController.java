package com.mccoy.smalltalk.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;

@Controller
@RequestMapping("/")
public class ViewController {

    @GetMapping("login")
    public String getLoginView() {
        return "login";
    }
}
