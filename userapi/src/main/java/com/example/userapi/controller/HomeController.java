package com.example.userapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome to the User API. Use /api/user/register to register and /api/user/fetch to fetch user details.";
    }
}
