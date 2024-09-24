package com.github.empresaDeSeguros.model;

public class ImovelResidencial implements BemSeguravel{

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.001) + 0.3 * areaConstruida;
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial com %dm2 de área contruída, avaliado em R$%.2f%n" +
                "Prêmio: R$%.2f%n",getAreaConstruida(),getValorMercado(),calcularValorPremio());
    }
}
