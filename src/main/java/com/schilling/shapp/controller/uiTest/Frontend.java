package com.schilling.shapp.controller.uiTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ui")
public class Frontend {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTestPage() {
        return "test.html";
    }

}
