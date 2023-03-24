//Faça um programa que converta metros para centímetros.

package com.ka.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma medida em metros para convertê-la em centímetros: ");
        double metro = scan.nextDouble();
        double centimetro = metro * 100;
        System.out.printf("%.1f metro(s) equivale a %.1f centímetro(s) %n", metro, centimetro);
    }
}
