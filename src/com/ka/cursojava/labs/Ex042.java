/* Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide
*  a entrada e permita repetir a operação */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int popA, popB, anos  = 0;
        double taxaCrescA, taxaCrescB;
        boolean validacao = true;

        while (validacao) {
            anos = 0;
            do {
                System.out.print("Digite o tamanho da população do país A [>0]: ");
                popA = sc.nextInt();
            } while (popA <=0);

            do {
                System.out.print("Digite a taxa de crescimento do país A [>0]: ");
                taxaCrescA = sc.nextDouble();
            } while (taxaCrescA <= 0);

            do {
                System.out.print("Digite o tamanho da população do país B [>0]: ");
                popB = sc.nextInt();
            } while (popB <= 0);

            do {
                System.out.print("Digite a taxa de crescimento do país B [>0]: ");
                taxaCrescB = sc.nextDouble();
            } while (taxaCrescB <= 0);


            while (popA < popB) {
                popA += (popA / 100) * taxaCrescA;
                popB += (popB / 100) * taxaCrescB;
                anos ++;
            }

            System.out.printf("Para a população do país A alcançar/ultrapassar a população do país B, serão " +
                    "necessários %d anos %n", anos);
            System.out.printf("População A em %d anos: %d %n",anos, popA);
            System.out.printf("População B em %d anos: %d %n", anos, popB);

            String continuar = "Y";
            while (!continuar.equals("S") && !continuar.equals("N")) {
                System.out.print("Quer continuar? [S/N]: ");
                continuar = sc.next().toUpperCase();
                if (continuar.equals("N")) {
                    validacao = false;
                }
            }

        }


    }
}
