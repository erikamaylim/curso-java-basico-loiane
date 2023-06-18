package com.ka.cursojava.labs.ex129;

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
}
