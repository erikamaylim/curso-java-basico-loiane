/* O Departamento Estadual de Meteorologia contratou-lhe para desenvolver um programa que leia um conjunto
indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das
temperaturas.
*/

package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex027Outro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean validacao = true;
        int contagem = 0;
        double temp, soma = 0, media, maior = 0, menor = 0;

        System.out.println("DEPARTAMENTO ESTADUAL DE METEOROLOGIA");
        do {
            contagem++;
            System.out.print("Informe a temperatura (Para encerrar, digite -1000): ");
            temp = sc.nextDouble();
            if (temp == -1000) {
                contagem -= 1;
                break;
            }
            soma += temp;
            if (contagem == 1) {
                maior = temp;
                menor = temp;
            }
            if (temp > maior) {
                maior = temp;
            }
            if (temp < menor) {
                menor = temp;
            }


        } while (validacao);

        media = soma / contagem;
        System.out.printf("Menor temperatura registrada: %.1fºC %n", menor);
        System.out.printf("Maior temperatura registrada: %.1fºC %n", maior);
        System.out.printf("Média das temperaturas registradas: %.1fºC %n", media);
    }
}
