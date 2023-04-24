//Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Farenheit: ");
        double farenheit = scan.nextDouble();
        double celsius = 5 * (farenheit - 32) / 9;
        System.out.printf("A temperatura informada convertida em Celsius é %.1f ºC %n", celsius);
    }
}
