package com.fbclone.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/LandingPage")
    public String landingpage()
    {
        return "LandingPage";
    }

    @GetMapping("/home")
    public String home(Model view)
    {
        return "home";
    }

    @GetMapping("/SignUp")
    public String signup(Model view)
    {
        return "Signup";
    }
}
