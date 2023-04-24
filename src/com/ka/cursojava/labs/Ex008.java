//Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o
// total do seu salário no referido mês.

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora trabalhada: ");
        double valorHora = scan.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHora * horasTrabalhadas;
        System.out.printf("Este mês, você receberá R$ %.2f %n", salario);
    }
}
