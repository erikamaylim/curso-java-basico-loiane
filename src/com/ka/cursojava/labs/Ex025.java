// As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para
// desenvolver o programa que calculará os reajustes.
// Faça um programa que receba o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no
// salário atual:
//      Salário até R$ 280,00 (incluído): aumento de 20%
//      Salário entre R$ 280,00 e R$ 700,00: aumento de 15%
//      Salário entre R$ 700,00 e R$ 1500,00: aumento de 10%
//      Salário entre R$ 1500,00 em diante: aumento de 5%
// Após calcular o aumento, exiba na tela:
//      O salário antes do reajuste
//      O percentual de aumento aplicado
//      O valor do aumento
//      O novo salário


package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o salário atual para calcular o reajuste: ");
        double salarioAtual = scan.nextDouble();
        double salarioReajuste;
        double percentual = 0;
        double aumento = 0;
        if (salarioAtual <= 280) {
            percentual = 20;

        } else if (salarioAtual > 280 && salarioAtual <=700) {
            percentual = 15;

        } else if (salarioAtual > 700 && salarioAtual <= 1500) {
            percentual = 10;

        } else if (salarioAtual > 1500) {
            percentual = 5;
        }

        aumento = (salarioAtual/ 100) * percentual;
        salarioReajuste = salarioAtual + aumento;
        System.out.printf("Salário atual: R$ %.2f %n", salarioAtual);
        System.out.printf("Percentual de aumento: %.0f%% %n", percentual);
        System.out.printf("Aumento: R$ %.2f %n", aumento);
        System.out.printf("Novo salário: R$ %.2f %n", salarioReajuste);


    }
}
