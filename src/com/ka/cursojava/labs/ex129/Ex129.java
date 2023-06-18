/*
Escreva uma classe chamada Calculadora que tenha os seguintes métodos: somar, subtrair, multiplicar, dividir (dois
números), elevar à potência n. Desenvolva um programa para testar essa classe.
*/

package com.ka.cursojava.labs.ex129;

public class Ex129 {
    public static void main(String[] args) {
        imprimirTela(Calculadora.somar(10, 13));
        imprimirTela(Calculadora.subtrair(127, 11));
        imprimirTela(Calculadora.multiplicar(13, 12));
        imprimirTela(Calculadora.dividir(17, 5));
        imprimirTela(Calculadora.elevarPotencia(10, 3));
    }

    public static void imprimirTela(int n) {
        System.out.println(n);
    }
    public static void imprimirTela(double n) {
        System.out.println(n);
    }
}
