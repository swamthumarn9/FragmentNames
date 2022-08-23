package com.ace.lms.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminHomeController {

    @GetMapping("/home")
    public String home(){
        return "ADM01";
    }

    @GetMapping("/profile")
    public String getProfile(){return "ADM14";}
}
