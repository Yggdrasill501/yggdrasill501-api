package net.yggdrasill501.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LandingPageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
