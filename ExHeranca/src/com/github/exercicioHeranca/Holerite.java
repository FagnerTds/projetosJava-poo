package com.github.exercicioHeranca;

public record Holerite(String nome, String mesAno, double valorSario ) {

    public void imprimir(){
        System.out.println();
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Data : %s%n", mesAno);
        System.out.printf("Valor do salário: R$%.2f%n", valorSario);
    }

}
