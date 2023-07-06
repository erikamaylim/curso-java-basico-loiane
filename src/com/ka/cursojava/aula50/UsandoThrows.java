package com.ka.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {
        System.out.print("Entre com um número decimal: ");
        try {
            double n = lerNumero();
            System.out.println("Você digitou " + n);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }

    public static double lerNumero() throws Exception{
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        return n;
    }
}
