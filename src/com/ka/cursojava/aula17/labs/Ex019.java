/* Faça um programa que calcule e mostre a média aritmética de n notas. */

package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean validacao = true;
        String continuar;
        double soma = 0, media = 0;
        int cont = 0;

        System.out.println("Digite quantas notas quiser e calcule a média entre elas");
        do {
            System.out.print("Digite a nota: ");
            double nota = sc.nextDouble();
            soma += nota;
            cont++;
            do {
                System.out.print("Quer continuar? [S/N]: ");
                continuar = sc.next().toUpperCase();
            } while (!continuar.equals("S") && !continuar.equals("N"));
            if (continuar.equals("N")) {
                validacao = false;
            }

        } while (validacao);

        media = soma / cont;
        System.out.printf("Média: %.1f", media);
    }
}
