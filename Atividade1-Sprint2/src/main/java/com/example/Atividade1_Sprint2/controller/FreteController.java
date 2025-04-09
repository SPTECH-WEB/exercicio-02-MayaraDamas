package com.example.Atividade1_Sprint2.controller;


import com.example.Atividade1_Sprint2.service.FreteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fretes")
public class FreteController {
    private final FreteService freteService;

    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @GetMapping
    public String calcularFrete(String modalidade, double peso){
        double valor = freteService.calcular(modalidade, peso);
        return "Frete (" + modalidade +") para" + peso + "Kg: R$" + valor;
    }
}
