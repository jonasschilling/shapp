package com.schilling.shapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ui")
public class LandingController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndex() {
        return "index.html";
    }

}
