// Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre
// o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Rebda, 8% para o INSS
// e 5% para o sindicato. Faça um programa que mostre:
// -> O salário bruto;
// -> Quanto pagou ao INSS;
// -> Quanto pagou ao sindicato;
// -> O salário líquido.


package com.ka.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora trabalhada: ");
        double valorHora = scan.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        System.out.printf("Salário bruto: R$ %.2f %n", salarioBruto);

        double inss = (salarioBruto / 100) * 8;
        System.out.printf("INSS: R$ %.2f %n", inss);

        double sindicato = (salarioBruto / 100) * 5;
        System.out.printf("Sindicato: R$ %.2f %n", sindicato);

        double impostoDeRenda = (salarioBruto / 100) * 11;
        System.out.printf("Imposto de Renda: R$ %.2f %n", impostoDeRenda);

        double totalDescontos = inss + sindicato + impostoDeRenda;
        System.out.printf("Total de Descontos: R$ %.2f %n", totalDescontos);

        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.printf("Salário líquido: R$ %.2f %n", salarioLiquido);

    }
}
