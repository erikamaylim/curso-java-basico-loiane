/* Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10. O usuário deve
informar de qual número deseja ver a tabuada.  */

package com.ka.cursojava.labs;

import java.util.Scanner;

public class Ex049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ver a tabuada do número: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d X %d = %3d %n", i, num, i * num);
        }
    }
}
