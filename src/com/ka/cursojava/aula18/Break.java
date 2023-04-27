package com.ka.cursojava.aula18;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int n1 = sc.nextInt();

        System.out.print("Entre com um limite: ");
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (i % 7 == 0) {
                System.out.printf("%d é o primeiro valor divisível por 7 após o número %d.", i, n1);
                break;
            }
        }
    }
}
