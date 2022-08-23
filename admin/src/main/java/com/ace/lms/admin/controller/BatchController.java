package com.ace.lms.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class BatchController {

    @GetMapping("/batchlists")
    public String batchList(){
        return "ADM08";
    }

    @GetMapping("/batchcreate")
    public String batchCreate(){
        return "ADM09";
    }

    @GetMapping("/batchviews")
    public String batchViews(){
        return "ADM10";
    }

    @GetMapping("/batchdetails")
    public String batchDetails(){
        return "ADM11";
    }

    @GetMapping("/attendancelist")
    public String attendanceLists(){
        return "ADM12";
    }


}
