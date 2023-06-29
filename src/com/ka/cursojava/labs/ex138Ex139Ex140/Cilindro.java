package com.ka.cursojava.labs.ex138Ex139Ex140;

public class Cilindro extends Figura3D  {
    private double altura;

    private double raio;

    public Cilindro() {
    }

    public Cilindro(double altura, double raio) {
        this.altura = altura;
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * (Math.pow(this.getRaio(), 2)) * this.getAltura();
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.PI * (Math.pow(this.getRaio(), 2));
        double areaLateral = 2 * Math.PI * this.getRaio() * this.getAltura();
        double areaTotal = 2 * areaBase + areaLateral;
        return areaTotal;
    }
}
