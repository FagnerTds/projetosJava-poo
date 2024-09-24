package com.github.empresaDeSeguros.model;

public class Caminhao extends VeiculoAutomotor{

    public static final int PRECO_POR_QUANTIDADE_POR_EIXO = 50;
    private int quandtidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quandtidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quandtidadeEixos = quandtidadeEixos;
    }

    public int getQuandtidadeEixos() {
        return quandtidadeEixos;
    }

    public void setQuandtidadeEixos(int quandtidadeEixos) {
        this.quandtidadeEixos = quandtidadeEixos;
    }

    @Override
    public double calcularValorPremio() {

        return (getValorMercado() * 0.02) + (PRECO_POR_QUANTIDADE_POR_EIXO * getQuandtidadeEixos());
    }

    @Override
    public String descrever() {
        return String.format("CAMINHÃO modelo %s, fabricado no ano %d, com %d eixos, avaliado em R$%.2f%n" +
                "Prêmio: R$%.2f%n",getModelo(),getAnoFabricacao(), getQuandtidadeEixos(),getValorMercado()
                ,calcularValorPremio());
    }
}
