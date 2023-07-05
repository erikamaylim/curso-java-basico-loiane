/*
Curso de Java 47: Exceptions: try, catch
 */
package com.ka.cursojava.aula47;

public class Aula47 {
    public static void main(String[] args) {
        /*int[] vetor = new int[4];

        System.out.println("Antes da exception");

        vetor[4] = 1;

        System.out.println("Esse texto não será impresso");*/   // Esse trecho terá um erro de exceção

        try {
            int[] vetor = new int[4];
            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um índice que não existe no vetor");
        }

        System.out.println("Esse texto será impresso após a exception");

    }
}
