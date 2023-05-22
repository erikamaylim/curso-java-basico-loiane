package com.ka.cursojava.aula26;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.printf("A autonomia do carro é de %.2f km. %n", autonomia);

    }
}
