/* Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um
triângulo. Indique, caso os lados formem um triângulo, se o mesmo é equilátero, isósceles ou escaleno.
Dicas:
- Forma um triângulo se a soma de quaisquer lados for maior que o terceiro
- Equilátero: três lados iguais
- Isósceles: quaisquer dois lados iguais
- Escaleno: três lados diferentes
*/

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 medidas e descubra se elas formam um triângulo e, caso forme, qual tipo de " +
                "triângulo.");
        System.out.print("Digite o primeiro lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double lado3 = sc.nextDouble();

        if ((lado1 + lado2 <= lado3) || (lado2 + lado3 <= lado1) || (lado3 + lado1 <= lado2)) {
            System.out.println("As medidas NÃO formam um triângulo!");

        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo EQUILÁTERO (três lados iguais).");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo ISÓSCELES (dois lados iguais).");
            } else {
                System.out.println("Triângulo ESCALENO (três lados diferentes).");
            }
        }
    }
}
