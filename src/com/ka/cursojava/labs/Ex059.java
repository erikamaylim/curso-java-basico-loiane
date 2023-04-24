/* Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio
gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para cada um.
* */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numPecas;
        double precoPeca, soma = 0, media = 0;

        System.out.println("DESCUBRA QUANTO INVESTIU EM SUA COLEÇÃO!");
        System.out.print("Digite o número de peças: ");
        numPecas = sc.nextInt();
        for (int i = 1; i <= numPecas; i++) {
            System.out.printf("Valor da peça %d: ", i);
            precoPeca = sc.nextDouble();
            soma += precoPeca;
        }

        media = soma / numPecas;

        System.out.printf("Valor total investido: R$ %.2f %n", soma);
        System.out.printf("Média de investimento por peça: R$ %.2f %n", media);
    }
}
