package com.ka.cursojava.aula52;

public class DivisaoNaoExata extends Exception {
    private int numerador;
    private int denominador;

    public DivisaoNaoExata(int numerador, int denominador) {
        super();
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Resultado de " + numerador +
                "/" + denominador +
                " não é um inteiro";
    }
}

