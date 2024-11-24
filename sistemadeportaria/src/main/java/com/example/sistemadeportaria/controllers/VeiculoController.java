package com.example.sistemadeportaria.controllers;

import com.example.sistemadeportaria.model.Veiculos;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VeiculoController {

    @GetMapping("/inserirVeiculos")
    public ModelAndView insertVeiculos(Veiculos veiculo) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("veiculo/formVeiculos"); // Caminho para o template
        mv.addObject("veiculo", new Veiculos()); // Cria um novo objeto Veiculo
        return mv;
    }
}