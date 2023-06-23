package com.ka.cursojava.labs.ex136;

public abstract class Contribuinte {
    private String nome;
    private double rendaBruta;
    private double imposto;

    public Contribuinte() {
    }
    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        return "Dados do contribuinte: " +
                "\n\tNome: " + nome;

    }
}
