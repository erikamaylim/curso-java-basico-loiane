//Faça um programa que peça o raio de um círculo, calcule e mostre a sua área.

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o raio de um círculo: ");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio,2);
        System.out.printf("A área deste círculo é %.1f m² %n", area);
    }
}
