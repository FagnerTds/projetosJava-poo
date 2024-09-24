package com.github.empresaDeSeguros.model;

public class CarroParticular extends VeiculoAutomotor{

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorFinal = getValorMercado() * 0.04;
        if (getAnoFabricacao() <= 2000) {
            valorFinal += valorFinal * 0.05;
        }
        return valorFinal;
    }

    @Override
    public String descrever() {
        return String.format("Carro particular modelo %s, fabricado no ano %d avaliado em R$%.2f%n" +
                "Prêmio: R$%.2f%n",getModelo(),getAnoFabricacao(),getValorMercado(),calcularValorPremio());
    }
}
