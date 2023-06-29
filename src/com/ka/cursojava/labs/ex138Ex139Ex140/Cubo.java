package com.ka.cursojava.labs.ex138Ex139Ex140;

public class Cubo extends Figura3D {
    private double aresta;

    public Cubo() {
    }

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(this.getAresta(), 3);
    }

    @Override
    public double calcularArea() {
        return 6 * (Math.pow(this.getAresta(), 2));
    }
}
