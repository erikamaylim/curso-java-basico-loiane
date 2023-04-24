/* Altere o programa anterior para mostrar no final a soma dos números. */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.println("Descubra a soma dos valores entre dois números");
        System.out.print("Digite um número: ");
        int n1 = sc.nextInt() ;
        System.out.print("Digite outro número: ");
        int n2 = sc.nextInt();
        if (n1 < n2){
            for (; n1 <= n2; n1++) {
                if (n1 == n2) {
                    System.out.print(n1 + " = ");
                } else {
                    System.out.print(n1 + " + ");
                }
                soma += n1;
            }
        } else if (n1 > n2) {
            for (; n1 >= n2; n1--) {
                if (n1 == n2) {
                    System.out.print(n1 + " = ");

                } else {
                    System.out.print(n1 + " + ");

                }
                soma += n1;

            }

        }
        System.out.print(soma);

    }
}
