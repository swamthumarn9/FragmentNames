package com.ace.lms.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ExamController {

    @GetMapping("/examcreate")
    public String examCreate(){
        return "ADM05";
    }

    @GetMapping("/examlist")
    public String examLists(){
        return "ADM13";
    }

}
