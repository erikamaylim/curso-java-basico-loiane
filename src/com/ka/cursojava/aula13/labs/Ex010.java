//Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

package com.ka.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scan.nextDouble();
        double farenheit = celsius * 1.8 + 32;
        System.out.printf("A temperatura informada convertida em Farenheit é %.1f ºF %n", farenheit);
    }
}
