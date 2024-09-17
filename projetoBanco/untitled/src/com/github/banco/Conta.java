package com.github.banco;

import java.util.Objects;

public class Conta {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Titular getTitular() {
        return titular;
    }


    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public final double getSaldo() {
        return saldo;
    }

    public boolean possuiGratuidadeDeImpressao() {
        return false;
    }

    public void sacar(double valorSaque) {
        if (valorSaque < 0) {
            throw new IllegalArgumentException("valor do saque deve ser maior que 0");
        }
        if (valorSaque > getSaldo()) {
            throw new IllegalArgumentException("Saldo insificiente para saque");
        }
        saldo-= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < 0) {
            throw new IllegalArgumentException("valor do saque deve ser maior que 0");
        }
        saldo += valorDeposito;
    }

    public void imprimeirDemosntrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return agencia == conta.agencia && numero == conta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }
    
}
