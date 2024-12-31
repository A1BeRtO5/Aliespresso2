package com.Aliespresso.Aliespresso2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        return "/home";
    }

    @GetMapping("/aboutUs")
    public String aboutUs(Model model) {
        return "/aboutUs";
    }

    @GetMapping("/contacts")
    public String contacts(Model model) {
        return "/contacts";
    }

    @GetMapping("/goods")
    public String goods(Model model) {
        return "/goods";
    }



    @GetMapping("/test3")
    public String test3(Model model) {
        return "/test3";
    }
    @GetMapping("/test4")
    public String test4(Model model) {
        return "/test4";
    }
    @GetMapping("/test5")
    public String test5(Model model) {
        return "/test5";
    }
    @GetMapping("/test6")
    public String test6(Model model) {
        return "/test6";
    }
    @GetMapping("/test7")
    public String test7(Model model) {
        return "/test7";
    }

}