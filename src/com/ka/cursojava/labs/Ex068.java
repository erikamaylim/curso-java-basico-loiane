/* Um funcionário de uma empresa recebe aumento salarial anualmente.
Sabe-se que:
    Esse funcionário foi contratado em 1995, com salário inicial de R$ 1000,00
    Em 1996, recebeu aumento de 1,5% sobre o seu salário inicial
    A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.
    Faça um programa que determine o salário atual deste funcionário. Após concluir, altere o programa, permitindo
    que o usuário digite o salário inicial do funcionário.

*/

package com.ka.cursojava.labs;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Ex068 {
    public static void main(String[] args) {
        boolean validacao = true;
        double salario = 1000;
        Scanner sc = new Scanner(System.in);
        do {
            double percentual = 1.5;

            Calendar cal = GregorianCalendar.getInstance();

            salario += (salario / 100) * percentual;

            for (int i = 1997; i <= cal.get(Calendar.YEAR); i++) {
                percentual *= 2;
                salario = salario + (salario / 100) * percentual;

                System.out.printf("Salário em %d com aumento de %.1f%%: R$ %,.2f %n", i, percentual, salario);
            }

            System.out.print("Digite outro salário inicial (0 para encerrar): ");
            salario = sc.nextDouble();
            if(salario == 0) {
                validacao = false;
            }


        } while (validacao);

    }
}
