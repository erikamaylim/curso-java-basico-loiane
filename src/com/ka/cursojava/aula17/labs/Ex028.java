/* Os números primos possuem várias aplicações dentro da computação, por exemplo, na criptografia. Um número primo é
aquele divisível por apenas 1 e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é
 primo ou não.
*/

package com.ka.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int cont = 0;

        System.out.print("Digite um número e descubra se ele é primo: ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            if (num % i == 0) {
                cont++;
            }
            if (cont == 3) {
                break;
            }
        }

        if (cont == 2) {
            System.out.printf("%d é primo %n", num);
        } else {
            System.out.printf("%d não é primo %n", num);
        }

    }
}
