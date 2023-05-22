package com.ka.cursojava.aula27;

public class Carro {
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.printf("A autonomia do carro é de %.2f km. %n", capacidadeCombustivel * consumoCombustivel);
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonimia foi chamado.");
        return capacidadeCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
