package com.github.banco;

public class Principal {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Fagner Tranquis", "44499955520"));
        conta1.setAgencia(123);
        conta1.setNumero(999999);

        conta1.imprimeirDemosntrativo();

        conta1.depositar(100);
        conta1.imprimeirDemosntrativo();

        conta1.sacar(25);
        conta1.imprimeirDemosntrativo();


    }
}
