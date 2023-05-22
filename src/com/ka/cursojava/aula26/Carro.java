package com.ka.cursojava.aula26;

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

}
