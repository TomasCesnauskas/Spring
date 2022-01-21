package com.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage() {
        return "main-menu";
    }
//    need controler method to proces html process
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
}
