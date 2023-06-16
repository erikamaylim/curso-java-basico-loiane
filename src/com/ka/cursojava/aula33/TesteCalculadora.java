// Sobrecarga de métodos (overload)

package com.ka.cursojava.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora c = new MinhaCalculadora();
        System.out.println(c.soma(1, 2));
        System.out.println(c.soma(1d, 2d));
        System.out.println(c.soma(1, 2, 3));
        int[] vetor = {0, 1, 2, 3, 4, 5};
        System.out.println(c.soma(vetor));

    }
}
