//Faça um programa que peça as 4 notas bimestrais e mostre a média.

package com.ka.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite suas 4 notas: ");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();
        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("Sua média é %.1f %n", media );
    }
}
