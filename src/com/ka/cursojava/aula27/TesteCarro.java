package com.ka.cursojava.aula27;


public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.printf("A autonomia do carro é de %.2f km. %n", autonomia);

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.printf("qtdCombustivel10 = %.2f %n", qtdCombustivel10);
        System.out.printf("qtdCombustivel15 = %.2f %n", qtdCombustivel15);

    }
}
