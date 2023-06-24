package com.ka.cursojava.labs.ex137;

public class Animal {
    private String nome;
    private double comprimento;
    private int NumeroPatas;
    private String cor;
    private String ambiente;
    private int velocidade;

    public Animal() {
    }

    public Animal(String nome, double comprimento, int numeroPatas, String cor, String ambiente, int velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        NumeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return NumeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        NumeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Dados do espécime: " +
                "\n\tAnimal: " + nome +
                "\n\tComprimento: " + String.format("%.0f", comprimento) + " cm" +
                "\n\tNúmero de patas: " + NumeroPatas +
                "\n\tCor: " + cor +
                "\n\tAmbiente: " + ambiente +
                "\n\tVelocidade: " + velocidade + " km/h";
    }
}
