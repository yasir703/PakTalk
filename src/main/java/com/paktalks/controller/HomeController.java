package com.paktalks.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*

@author Yasir Amin
*/


@RestController
public class HomeController {
    @RequestMapping("/")
    public String home (){
        return "Hello Hello";
    }
}
