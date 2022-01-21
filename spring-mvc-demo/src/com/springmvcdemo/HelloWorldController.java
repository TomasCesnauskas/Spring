package com.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

//    need a controler method to show initial html form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

//    add new controler method, to read data and add to model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
//  nuskaityti uzklausos parametra is html formos
        String name = request.getParameter("studentName");

//        konvertuoti duomenis i didziasias raides
        name = name.toUpperCase();

//        sukurti zinute
        String result = "Eee! "+ name;
//        zinutes pridejimas modelyje
        model.addAttribute("mesage",result);
        return "helloworld";
    }

// susikuriau bloko kopija. naudoju @RequestParam vietoj HttpServletRequest
    //    add new controler method, to read data and add to model
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
            @RequestParam("studentName") String name,
            Model model){

//        konvertuoti duomenis i didziasias raides
        name = name.toUpperCase();

//        sukurti zinute
        String result = "Hello my friend "+ name;
//        zinutes pridejimas modelyje
        model.addAttribute("mesage",result);
        return "helloworld";
    }
}
