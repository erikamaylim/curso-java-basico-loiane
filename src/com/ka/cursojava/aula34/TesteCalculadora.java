// Curso de Java 34 - Orientação a Objetos: Variáveis e metodos estáticos (modificador static)

package com.ka.cursojava.aula34;

public class TesteCalculadora {
    public static void main(String[] args) {
        // Não precisa instanciar a classe quando o método possui o modificador static
        System.out.println(MinhaCalculadora.soma(1, 2));
        System.out.println(MinhaCalculadora.soma(1d, 2d));
        System.out.println(MinhaCalculadora.soma(1, 2, 3));
        int[] vetor = {0, 1, 2, 3, 4, 5};
        System.out.println(MinhaCalculadora.soma(vetor));

    }
}

