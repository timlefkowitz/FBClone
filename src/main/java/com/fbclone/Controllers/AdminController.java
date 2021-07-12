package com.fbclone.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {


//    Admin home

    @GetMapping("/adminhome")
    public String landingpage(Model view)
    {
        return "admin/AdminsHome";
    }
}

