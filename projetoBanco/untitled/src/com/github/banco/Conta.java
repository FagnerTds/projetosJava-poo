package com.github.banco;

public class Conta {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valorSaque) {
        if (valorSaque < 0) {
            throw new IllegalArgumentException("valor do saque deve ser maior que 0");
        }
        if (valorSaque > getSaldo()) {
            throw new IllegalArgumentException("Não há saldo para o valor de saque"+valorSaque);
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

}
