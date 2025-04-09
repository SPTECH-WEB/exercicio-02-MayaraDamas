package com.example.Atividade1_Sprint2.service;

import org.springframework.stereotype.Component;

@Component
public class EntregaExpressa implements FreteStrategy{

    @Override
    public double calcular(double peso){
        return peso * 5.6 + 20;
    }

    @Override
    public String modalidade(){
        return "entrega expressa";
    }

}
