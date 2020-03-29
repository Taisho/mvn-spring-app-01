package com.example.tihomirmitkov.controllers;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DefaultController{

    @Order(value = 9999999)
    @RequestMapping(value = {"{path:(?!/static|error|/index.html|/api).*$}"})
    public String handler(Model model) {
        ModelAndView mav = new ModelAndView("default");
        return "default";
    }
}
