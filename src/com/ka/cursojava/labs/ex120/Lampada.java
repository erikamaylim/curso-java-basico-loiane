package com.ka.cursojava.labs.ex120;

public class Lampada {
    boolean ligada;

    void ligarLampada() {
        ligada = true;
    }

    void desligarLampada() {
        ligada = false;
    }

    void mostrarEstadoLampada() {
        if (ligada) {
            System.out.println("Lâmpada ligada.");
        } else {
            System.out.println("Lâmpada desligada.");
        }
    }
}
