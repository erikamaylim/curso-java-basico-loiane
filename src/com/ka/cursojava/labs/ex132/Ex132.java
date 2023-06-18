/*
Escreva um método recursivo e estático que receba um número inteiro positivo N
e calcule o somatório dos números de 1 a N.
*/

package com.ka.cursojava.labs.ex132;

import java.util.Scanner;

public class Ex132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um número inteiro n para exibir o somatório dos números de 1 a n: ");
        int n = sc.nextInt();
        imprimirTela(somatorio(n));
    }

    public static int somatorio(int n) {
        if(n == 1) {
            return 1;
        }
        return n + somatorio(n-1);
    }

    public static void imprimirTela(int n) {
        System.out.println(n);
    }

}
