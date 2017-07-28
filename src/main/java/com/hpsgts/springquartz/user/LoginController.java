package com.hpsgts.springquartz.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = "/login/doLogin")
    public String doLogin(){
        return "admin-index";
    }
}
