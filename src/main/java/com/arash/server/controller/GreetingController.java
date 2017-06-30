package com.arash.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author arasshchektaiev
 */
@Controller
@RequestMapping("/hello")
public class GreetingController {

    @RequestMapping(value = "/getGreeting", method = RequestMethod.GET)
    @ResponseBody
    public String getGreeting(ModelMap model) {
        return "Hello, World!";
    }
}
