package com.ka.cursojava.aula11;

public class CuriosidadeInt {
    public static void main(String[] args) {
        int x1 = 2147483647; // este é o valor máximo do inteiro
        int x2 = 1;

        System.out.println(x1 + x2); // o resultado vai ser o menor valor de int.
                                    // Vai funcionar como uma roleta, voltando para o início.
    }
}
