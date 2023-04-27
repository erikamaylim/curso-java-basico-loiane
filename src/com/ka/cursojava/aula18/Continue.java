package com.ka.cursojava.aula18;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int n1 = sc.nextInt();

        System.out.print("Entre com um limite: ");
        int n2 = sc.nextInt();

        System.out.printf("Números entre %d e %d divisíveis por 7: %n", n1, n2);
        for (int i = n1; i <= n2; i++) {
            if (i % 7 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
