package com.github.banco;

public class Principal3 {

    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial();
        conta1.setTitular(new Titular("Fagner Tranquis", "44499955520"));
        conta1.setAgencia(123);
        conta1.setNumero(999999);
        conta1.setLimiteCheuqueEspecial(1000);
        conta1.setTarifaMensal(90);

        conta1.imprimeirDemosntrativo();

        conta1.depositar(100);
        conta1.imprimeirDemosntrativo();

        conta1.sacar(200);
        conta1.imprimeirDemosntrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimeirDemosntrativo();
    }
}
