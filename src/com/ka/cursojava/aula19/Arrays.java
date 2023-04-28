package com.ka.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {
        // Armazenar temperaturas medidas diariamente no período de 10 dias

        double[]  temperaturas = new double[10];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.printf("A temperatura do dia 1 foi %.1fºC %n", temperaturas[0]);

        System.out.printf("Tamanho do array: %d %n", temperaturas.length);

        int i = 1;
        for (double temp: temperaturas
             ) {
            System.out.printf("Temperatura do dia %02d: %4.1fºC %n", i, temp);
            i++;
        }

    }
}
