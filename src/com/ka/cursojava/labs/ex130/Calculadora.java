package com.ka.cursojava.labs.ex130;

public class Calculadora {
    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public static double dividir(int n1, int n2) {
        return (double) n1 / n2;
    }

    public static int elevarPotencia(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        for(int i = n - 1; i > 1; i--) {
            n *= i;
        }
        return n;
    }
}
