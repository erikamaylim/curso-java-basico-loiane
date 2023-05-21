package com.ka.cursojava.aula25;

public class Carro {
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.printf("A autonomia do carro é de %.1f km", capacidadeCombustivel * consumoCombustivel);
    }


}
