package com.ka.cursojava.aula49;

public class Aula49 {
    public static void main(String[] args) {
        int[] numeradores = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeradores.length; i++) {
            try {
                System.out.println(numeradores[i] + " / " + denominadores[i] + " = " + numeradores[i] / denominadores[i]);
            } catch (ArithmeticException exception) {
                System.out.println("Erro ao dividir por zero");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Posição do array inválida");
            } finally {
                System.out.println("Essa linha é impressa sempre após o try ou o catch");
            }
        }
    }
}
