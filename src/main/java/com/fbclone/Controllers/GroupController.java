package com.fbclone.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroupController {

    @GetMapping("/group")
    public String landingpage(Model view)
    {
        return "LandingPage";
    }



}
