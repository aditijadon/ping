package com.pingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController {

    @Autowired

    //Sample URL - localhost:8080/ping
    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public ModelAndView ping() {
        ModelAndView model = new ModelAndView();
        model.setViewName("dashboard");
        return model;
    }

}