package com.github.exercicioHeranca;

public class Programador extends Funcionario{

        private double bonus;

        public Programador(String nome, double valorHora) {
            super(nome, valorHora);
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        @Override
        protected final double calcularSalario(int horasTrabalhadas) {
            return bonus + super.calcularSalario(horasTrabalhadas);
        }

        @Override
        public String toString() {
            return "Programador{" +
                    "nome='" + getNome() + '\'' +
                    ", valorHora=" + getValorHora() +
                    ", Bonus=" + bonus +
                    '}';
        }


}
