package com.ka.cursojava.labs.ex138Ex139Ex140;

public class Circulo extends Figura2D  {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(this.getRaio(), 2));
    }
}
