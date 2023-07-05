package com.ka.cursojava.aula48;

public class MultiplosCatchJava7 {
    public static void main(String[] args) {
        int[] numeradores = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeradores.length; i++) {
            try {
                System.out.println(numeradores[i] + " / " + denominadores[i] + " = " + numeradores[i] / denominadores[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
                System.out.println("Ocorreu um erro");
            }
        }
    }

}
