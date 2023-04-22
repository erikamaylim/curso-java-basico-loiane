/* Faça um programa que calcule e mostre a média aritmética de n notas. */


package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex019OutraForma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0, media;
        int qtdNotas = 0;

        System.out.println("Digite algumas notas para calcular a média");
        System.out.print("Quer calcular a média entre quantas notas? ");
        qtdNotas = sc.nextInt();

        for(int i = 1; i <= qtdNotas; i++) {
            System.out.printf("Digite a nota %d: ", i);
            double nota = sc.nextDouble();
            soma += nota;
        }

        media = soma / qtdNotas;
        System.out.printf("Média: %.1f %n", media);
    }
}
