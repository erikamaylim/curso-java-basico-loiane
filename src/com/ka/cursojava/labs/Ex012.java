//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
// utilizando a seguinte fórmula:
// (72.7 * altura) - 58

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("Seu peso ideal é %.1f %n", pesoIdeal);
    }
}
