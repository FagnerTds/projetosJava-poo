package com.github.banco;

public class CaixaEletronico {
    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IPRESSAO_DEMONSTRATIVO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino,double valorTransferencia) {
        System.out.printf("Tranferindo R$%.2f da conta %d/%d para %d/%d%n", valorTransferencia,
                contaOrigem.getAgencia(),contaOrigem.getNumero(),contaDestino.getAgencia(),contaDestino.getNumero());
        contaOrigem.sacar(valorTransferencia +TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }
    public void imprimirDemonstrativo(Conta conta){
        if (conta.possuiGratuidadeDeImpressao()){
            System.out.println("Possui gratuidade de impressão");
        } else {
            debitarTarifaImpressaoDemonstrativo(conta);
        }

        conta.imprimeirDemosntrativo();
    }

    private static void debitarTarifaImpressaoDemonstrativo(Conta conta) {
        System.out.printf("Custo da impressão: R$%.2f%n", TARIFA_IPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IPRESSAO_DEMONSTRATIVO);
    }

}
