package com.ka.cursojava.aula17;

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println(" ");

        for (int i = 0, j = 10; i <= j; i ++, j --) {
            System.out.println("i= " + i + "; j= " + j);
        }

        System.out.println(" ");


        // loop for com parte ausente
        int count = 1;
        for ( ; count <= 5; count++) {
            System.out.println(count);
        }

        System.out.println(" ");

        for (int i = 1; i<=10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println(" ");

        int soma = 0;
        for (int i = 1; i <= 5; soma += i++);
        System.out.println("Soma = " + soma);

    }
}
