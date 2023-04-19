/* Uma fruteira está vendendo frutas com os seguintes preços:
- Morango:
    Até 5 kg: R$ 2,50 por kg
    Acima de 5 kg: R$ 2,20 por kg
- Maçã:
    Até 5 kg: R$ 1,80 por kg
    Acima de 5 kg: R$ 1,50 por kg
Se o cliente comprar mais de 8 kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá um desconto de
 10%.
 Escreva um algoritmo que peça a quantidade de morangos e maças (em kg) e escreva o valor a ser pago.
 */

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de Morangos (em kg): ");
        double qtdMorangos = sc.nextDouble();

        System.out.print("Digite a quantidade de Maçãs (em kg): ");
        double qtdMacas = sc.nextDouble();

        double precoMorangos = 0;
        double precoMacas = 0;

        if (qtdMorangos <= 5) {
            precoMorangos = qtdMorangos * 2.50;
        } else {
            precoMorangos = qtdMorangos * 2.20;
        }

        if (qtdMacas <= 5) {
            precoMacas = qtdMacas * 1.80;
        } else {
            precoMacas = qtdMacas * 1.50;
        }

        double precoTotal = precoMorangos + precoMacas;


        if (qtdMorangos + qtdMacas > 8 || precoTotal > 25) {
            precoTotal = precoTotal - ((precoTotal / 100) * 10);
        }

        System.out.printf("Valor a pagar: R$ %.2f", precoTotal);


    }
}
