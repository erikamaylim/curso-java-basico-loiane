/* Faça um programa que leia as duas notas parciais obtidas por um aluno numa disciplina ao longo do semestre e
calcule a sua média. A atribuição de conceitos deve obedecer à tabela abaixo:
 Média entre 9.0 e 10.0 - Conceito A
 Média entre 7.5 e 9.0 - Conceito B
 Média entre 6.0 e 7.5 - Conceito C
 Média entre 4.0 e 6.0 - Conceito D
 Média entre 0 e 4.0 - Conceito E
 O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem "Aprovado" se o conceito
 for A, B ou C e "Reprovado" se o conceito for D ou E*/

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("Nota 1: %.1f %n" +
                "Nota 2: %.1f %n" +
                "Média: %.1f %n", nota1, nota2, media);

        String conceito = "";
        if (media >=9 && media <=10) {
            conceito = "A";
        } else if (media >=7.5 && media < 9) {
            conceito = "B";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
        } else if (media >=0 && media < 4) {
            conceito = "E";
        }
        String situacao = "";
        switch (conceito) {
            case "A", "B", "C" -> situacao = "APROVADO";

            case "D", "E" -> situacao = "REPROVADO";
        }
        System.out.printf("Conceito: %s %n" +
                "Situação: %s %n", conceito, situacao);
    }
}
