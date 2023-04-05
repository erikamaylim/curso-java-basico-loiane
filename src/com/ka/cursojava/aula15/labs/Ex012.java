/* Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do IR, que depende do
salário bruto (conforme tabela abaixo) e 3% para o sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não
 é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O
 programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
    Desconto do IR;
    Salário Bruto até 900 (inclusive): isento;
    Salário Bruto até 1500 (inclusive): desconto de 5%;
    Salário Bruto até 2500 (inclusive): desconto de 10%;
    Salário Bruto acima de  2500 (inclusive): desconto de 20%;
Imprima na tela as informações dispostas conforme exemplo abaixo. No exemplo, o valor da hora é 5 e a quantidade de
horas é 220.
    Salário Bruto: (5 * 220)    : R$ 1100,00
    (-) IR (5%)                 : R%   55,00
    (-) INSS (10%)              : R%  110,00
    FGTS (11%)                  : R$  121,00
    Total de descontos          : R$  165,00
    Salário Líquido             : R$  935,00


*   */

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int IR = 0;
        double IRCalculado = 0;

        System.out.print("Valor por hora trabalhada: ");
        double valorHoraTrabalhada = scan.nextDouble();

        System.out.print("Quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;

        if (salarioBruto <= 900) {
            IR = 0;

        } else if (salarioBruto > 900 && salarioBruto <=1500){
            IR = 5;

        } else if (salarioBruto > 1500 && salarioBruto <=2500) {
            IR = 10;

        } else if (salarioBruto > 2500) {
            IR = 20;
        }

        IRCalculado = salarioBruto / 100 * IR;
        double INSS = salarioBruto / 100 * 10;
        double FGTS = salarioBruto / 100 * 11;
        double totalDescontos = IRCalculado + INSS;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto (%.0f X %.0f): R$ %.2f %n", valorHoraTrabalhada, horasTrabalhadas,
                salarioBruto);
        System.out.printf("(-) IR (%d%%): R$ %.2f %n", IR, IRCalculado);
        System.out.printf("(-) INSS (10%%): R$ %.2f %n", INSS);
        System.out.printf("FGTS (11%%): R$ %.2f %n", FGTS);
        System.out.printf("Total de descontos: R$ %.2f %n", totalDescontos);
        System.out.printf("Salário Líquido: R$ %.2f %n", salarioLiquido);

    }
}
