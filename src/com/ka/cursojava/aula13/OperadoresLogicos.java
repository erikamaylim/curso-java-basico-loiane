package com.ka.cursojava.aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 2;

        boolean r1 = (x1 == 1) && (x2 == 2);
        System.out.println("x1 é 1 AND x2 é 2 - resultado: " + r1);

        boolean r2 = (x1 == 1) || (x2 == 2);
        System.out.println("x1 é 1 OR x2 é 2 - resultado: " + r2);

        boolean r3 = !(x1 == 1);
        System.out.println(r3);
    }
}
