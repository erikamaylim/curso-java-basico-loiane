/* Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo entre eles. */

package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt() ;
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        if (n1 < n2){
            for (; n1 <= n2; n1++) {
                System.out.println(n1);
            }
        } else if (n1 > n2) {
            for (; n1 >= n2; n1--) {
                System.out.println(n1);
            }

        }


    }
}
