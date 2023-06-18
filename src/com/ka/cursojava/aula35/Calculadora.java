package com.ka.cursojava.aula35;

public class Calculadora {
    public static int fatorial(int n) {
        if (n == 0) {    // Este é o ponto de parada da recursividade.
            return 1;    // Sem ele, o programa fica em loop infinito.
        }
        return n * fatorial(n - 1);
    }
}
