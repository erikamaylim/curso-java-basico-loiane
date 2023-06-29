package com.ka.cursojava.labs.ex138Ex139Ex140;

public class Piramide extends Figura3D  {
    private double altura;
    private double arestabase;
    private double numeroArestas;
    private double apotema;
    private Figura2D base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestabase() {
        return arestabase;
    }

    public void setArestabase(double arestabase) {
        this.arestabase = arestabase;
    }

    public double getNumeroArestas() {
        return numeroArestas;
    }

    public void setNumeroArestas(double numeroArestas) {
        this.numeroArestas = numeroArestas;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calcularVolume() {
        if (base != null) {
            return (this.getBase().calcularArea() * this.getAltura()) / 3;
        }
        return 0;
    }

    @Override
    public double calcularArea() {
        if (base != null) {
            double areaSuperficieLateral = this.getNumeroArestas() * ((this.getArestabase() * this.getApotema()) / 2);
            return this.getBase().calcularArea() + areaSuperficieLateral;
        }
        return 0;
    }


}
