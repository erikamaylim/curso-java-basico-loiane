//Faça um programa que calcule a área de um quadrado e exiba o dobro desta área para o usuário.

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva o tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();
        double area = Math.pow(lado, 2);
        double dobroArea = area * 2;
        System.out.printf("A área do quadrado é %.1f e seu dobro é %.1f", area, dobroArea);
    }
}
