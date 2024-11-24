package com.example.sistemadeportaria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index");
        mv.addObject("msg", "Mensagem vinda diretamento do controller");
        return mv;
    }

}
