package com.ka.cursojava.aula52;

public class UsandoMinhaExceptionOutraOpcao {
    public static void main(String[] args) {
        try {
            teste();
        } catch (DivisaoNaoExata e) {
            e.printStackTrace();
        }
    }

    public static void teste() throws DivisaoNaoExata {
        int[] numeradores = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0, 2, 4};

        for(int i = 0; i < numeradores.length; i++) {
            try {
                if (numeradores[i] % 2 != 0) {
                    //lançar a exception aqui
                    throw new DivisaoNaoExata(numeradores[i], denominadores[i]);
                }
                System.out.println(numeradores[i] + " / " + denominadores[i] + " = " + numeradores[i] / denominadores[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Ocorreu um erro");
                e.printStackTrace();
            }
        }
    }
}
