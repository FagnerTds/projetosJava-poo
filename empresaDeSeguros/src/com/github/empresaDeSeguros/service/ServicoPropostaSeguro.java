package com.github.empresaDeSeguros.service;

import com.github.empresaDeSeguros.model.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bemSeguravel) {
        double calcularBem = bemSeguravel.calcularValorPremio();
        System.out.println("-----------------------");
        System.out.println("Proposta de Seguro");
        System.out.println("-----------------------");
        System.out.printf(bemSeguravel.descrever());

    }
}
