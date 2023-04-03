// Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por
// aluno e apresentar:
//  A mensagem "Aprovado" se a média for maior ou igual a 7;
//  A mensagem "reprovado" se a média for menor que 7;
//  A mensagem "Aprovado com distinção" se a média for igual a 10.
package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a nota da avaliação A1: ");
        double a1 = scan.nextDouble();
        System.out.print("Digite a nota da avaliação A2: ");
        double a2 = scan.nextDouble();

        double media = (a1 + a2) / 2;

        System.out.printf("Média: %.1f %n", media);

        if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else {
            System.out.println("Aprovado");
        }


    }
}
