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
            System.out.println("A lâmpada foi ligada");
        } else {
            System.out.println("A lâmpada já está ligada");
        }
    }

    public void desligar() {
        if (this.isLigada()) {
            this.setLigada(false);
            System.out.println("A lâmpada foi desligada");
        } else {
            System.out.println("A lâmpada já está desligada");
        }
    }

    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("Ligada");
        } else {
            System.out.println("Desligada");
        }
    }
}
