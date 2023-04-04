// Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a
// decisão é sempre pelo mais barato

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o preço do produto 1: R$ ");
        double produto1 = scan.nextDouble();

        System.out.print("Digite o preço do produto 2: R$ ");
        double produto2 = scan.nextDouble();

        System.out.print("Digite o preço do produto 3: R$ ");
        double produto3 = scan.nextDouble();

        if (produto1 <=produto2 && produto1 <= produto3) {
            System.out.println("Compre o produto 1");
        } else if (produto2 <= produto1 && produto2 <= produto3) {
            System.out.println("Compre o produto 2");
        } else if (produto3 <= produto1 && produto3 <= produto2) {
            System.out.println("Compre o produto 3");
        }




    }
}
