package com.ka.cursojava.labs.ex124;

public class Lampada {
    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        if (!this.isLigada()) {
            this.setLigada(true);
        }
        System.out.println("A lâmpada foi ligada");
    }

    public void desligar() {
        if (this.isLigada()) {
            this.setLigada(false);
        }
        System.out.println("A lâmpada foi desligada");
    }
}
