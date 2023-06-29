package com.ka.cursojava.labs.ex138;

public class Piramide extends Figura3D{
    private double altura;
    private double arestabase;
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
}
