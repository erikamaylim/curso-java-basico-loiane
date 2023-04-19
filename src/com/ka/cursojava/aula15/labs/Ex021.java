/* Um posto está vendendo combustíveis com a seguinte tabela de descontos:
- Álcool:
    Até 20 litros: 3% de desconto por litro
    Acima de 20 litros: 5% de desconto por litro
- Gasolina:
    Até 20 litros: 4% de desconto por litro
    Acima de 20 litros: 6% de desconto por litro
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível, calcule e imprima o valor a ser
pago pelo cliente sabendo-se que o preço do litro da Gasolina é R$ 2,50 e do álcool é R$ 1,90
 */

package com.ka.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite [G] para Gasolina ou [A] para Álcool: ");
        String combustivel = sc.next().toLowerCase();

        System.out.print("Digite quantos litros quer abastecer: ");
        int litros = sc.nextInt();
        double pagamento = 0;
        double precoGasolina = 2.50;
        double precoAlcool = 1.90;
        double desconto = 0;
        double precoSemDesc = 0;
        double totalDesc = 0;
        double precoFinal = 0;

        switch (combustivel) {
            case "a" -> {
                if (litros <= 20) {
                    desconto = 3;
                } else {
                    desconto = 5;
                }
                precoSemDesc = litros * precoAlcool;
            }
            case "g" -> {
                if (litros <= 20) {
                    desconto = 4;
                } else {
                    desconto = 6;
                }
                precoSemDesc = litros * precoGasolina;
            }
            default -> {
                System.out.printf("%s não é um valor válido %n", combustivel);
                System.exit(0);
            }

        }

        totalDesc = precoSemDesc / 100 * desconto;

        precoFinal = precoSemDesc - totalDesc;

        System.out.printf("Valor a pagar: R$ %.2f %n", precoFinal);
    }
}
