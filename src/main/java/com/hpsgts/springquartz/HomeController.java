package com.hpsgts.springquartz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String login(){
        return "login";
    }
    @RequestMapping("/index")
    public String index(){
        return "admin-index";
    }
}
