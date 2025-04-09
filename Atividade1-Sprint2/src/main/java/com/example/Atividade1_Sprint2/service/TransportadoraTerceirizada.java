package com.example.Atividade1_Sprint2.service;

import org.springframework.stereotype.Component;

@Component
public class TransportadoraTerceirizada implements FreteStrategy{

    @Override
    public double calcular(double peso){
        return peso + 50 % 20;
    }

    @Override
    public String modalidade(){
        return "transportadora terceirizada";
    }
}
