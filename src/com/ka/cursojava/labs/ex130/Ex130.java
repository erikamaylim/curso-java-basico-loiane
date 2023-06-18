/*
Escreva um método para calcular o fatorial de um número na classe Calculadora do exercício anterior.
*/

package com.ka.cursojava.labs.ex130;


public class Ex130 {
    public static void main(String[] args) {
        imprimirTela(Calculadora.somar(10, 13));
        imprimirTela(Calculadora.subtrair(127, 11));
        imprimirTela(Calculadora.multiplicar(13, 12));
        imprimirTela(Calculadora.dividir(17, 5));
        imprimirTela(Calculadora.elevarPotencia(10, 3));
        imprimirTela(Calculadora.fatorial(5));
    }

    public static void imprimirTela(int n){
        System.out.println(n);
    }
        public static void imprimirTela(double n){
        System.out.println(n);
    }


}
