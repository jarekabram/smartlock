package com.sec.smartlock.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping
    public String getWelcome() {
        return "welcome";
    }
}
