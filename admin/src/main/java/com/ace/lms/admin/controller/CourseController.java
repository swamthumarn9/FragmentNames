package com.ace.lms.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class CourseController {

    @GetMapping("/courseregister")
    public String courseRegister(){
        return "ADM02";
    }

    @GetMapping("/courselist")
    public String getCourseList(){
        return "ADM03";
    }

    @GetMapping("/modulelist")
    public String getModuleList(){return "ADM04";}
}
