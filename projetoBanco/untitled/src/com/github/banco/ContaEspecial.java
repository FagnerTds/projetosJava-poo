package com.github.banco;

public class ContaEspecial extends ContaInvestimento{

    private double tarifaMensal;
    private double limiteCheuqueEspecial;



    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteCheuqueEspecial() {
        return limiteCheuqueEspecial;
    }

    public void setLimiteCheuqueEspecial(double limiteCheuqueEspecial) {
        this.limiteCheuqueEspecial = limiteCheuqueEspecial;
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }
}
