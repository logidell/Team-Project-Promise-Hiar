package com.example.smp_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

    @RequestMapping(value = "/signUp")
    public String signUp(){
        return "/signUp";
    }

    @RequestMapping(value = "/signUpOwner")
    public String owner(){
        return "/signUpOwner";
    }

    @RequestMapping(value = "/signUpSelect")
    public String select(){
        return "/signUpSelect";
    }

}

