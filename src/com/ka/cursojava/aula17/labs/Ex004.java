/* Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% e
que a população de B seja de 200.000 habitantes com uma taxa de crescimento de 1.5%, faça um programa que calcule e
escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B,
mantidas as taxas de crescimento.

  */

package com.ka.cursojava.aula17.labs;

public class Ex004 {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int anos = 0;

        while (popA < popB) {
            popA += (popA / 100) * 3;
            popB += (popB / 100) * 1.5;
            anos ++;
        }

        System.out.printf("Para a população do país A alcançar/ultrapassar a população do país B, serão " +
                "necessários %d anos %n", anos);
        System.out.printf("População A em %d anos: %d %n",anos, popA);
        System.out.printf("População B em %d anos: %d %n", anos, popB);
    }

}
