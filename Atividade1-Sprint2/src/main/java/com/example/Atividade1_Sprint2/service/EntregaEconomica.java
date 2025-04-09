package com.example.Atividade1_Sprint2.service;

import org.springframework.stereotype.Component;

@Component
public class EntregaEconomica implements FreteStrategy {

    @Override
    public double calcular(double peso){
        return peso * 1.5;
    }

    @Override
    public String modalidade(){
        return "entrega economica";
    }


}
