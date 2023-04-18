// Faça um programa que leia um número e exiba o dia correspondente da semana (1 - Domingo, 2 - Segunda etc.). Se
// digitar outro valor, deve aparecer valor inválido.

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7 para saber o dia da semana correspondente: ");
        int diaSemana = sc.nextInt();

        switch (diaSemana) {
            case 1 -> System.out.printf("%d corresponde ao Domingo. %n", diaSemana);
            case 2 -> System.out.printf("%d corresponde à Segunda. %n", diaSemana);
            case 3 -> System.out.printf("%d corresponde à Terça. %n", diaSemana);
            case 4 -> System.out.printf("%d corresponde à Quarta. %n", diaSemana);
            case 5 -> System.out.printf("%d corresponde à Quinta. %n" , diaSemana);
            case 6 -> System.out.printf("%d corresponde à Sexta. %n", diaSemana);
            case 7 -> System.out.printf("%d corresponde ao Sábado. %n", diaSemana);
            default -> System.out.printf("%d é um valor inválido. %n", diaSemana);
        }
    }
}
