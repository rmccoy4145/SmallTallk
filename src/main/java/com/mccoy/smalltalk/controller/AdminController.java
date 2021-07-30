package com.mccoy.smalltalk.controller;

import com.mccoy.smalltalk.model.TalkingPoint;
import com.mccoy.smalltalk.service.TalkingPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/admin")
@RolesAllowed("ROLE_ADMIN")
public class AdminController {
    @Autowired
    TalkingPointService talkingPointService;

    @GetMapping()
    public String getAdminView(Model model) {
        getAllTalkingPoints(model);
        setModelNewTalkingPoint(model);
        return "admin";
    }

    @PostMapping("/createNewTalkingPoint")
    public String createNewTalkingPoint(@ModelAttribute("newTalkingPoint") TalkingPoint talkingPoint) {
        talkingPointService.create(talkingPoint);
        return "redirect:/admin";
    }

    public void getAllTalkingPoints(Model model) {
        List<TalkingPoint> points = talkingPointService.getAll();
        model.addAttribute("talkingPoints", points);
    }


    public void setModelNewTalkingPoint(Model model) {
        TalkingPoint talkingPoint = new TalkingPoint();
        model.addAttribute("newTalkingPoint", talkingPoint);
    }
}
