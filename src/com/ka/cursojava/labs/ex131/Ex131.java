/*
Escreva um método recursivo e estático que calcule e retorne o n-ésimo termo da sequência de Fibonacci. Alguns
números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
*/

package com.ka.cursojava.labs.ex131;

import java.util.Scanner;

public class Ex131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quer ver o termo de qual posição da sequência de Fibonacci? ");
        int n = sc.nextInt();
        System.out.print("Sem recursividade: ");
        imprimirTela(fibonacciSemRecursividade(n));
        System.out.print("Com recursividade: ");
        imprimirTela(fibonacciComRecursividade(n));
        System.out.println("Exibindo a sequência do método sem recursividade: ");
        for(int i = 1; i <= n; i++) {
            System.out.printf("%d ", fibonacciSemRecursividade(i));
        }
        System.out.println();
        System.out.println("Exibindo a sequência do método com recursividade: ");
        for(int i = 1; i <= n; i++) {
            System.out.printf("%d ", fibonacciComRecursividade(i));
        }

    }

    public static int fibonacciSemRecursividade(int n) {
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;
        if (n == 1) {
            return t1;
        } else if (n == 2) {
            return t2;
        }
        for (int i = 3; i <= n; i++) {
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }
        return t3;
    }

    public static int fibonacciComRecursividade(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fibonacciComRecursividade(n - 1) + fibonacciComRecursividade(n - 2);
    }

    public static void imprimirTela(int n) {
        System.out.println(n);
    }
}
