package com.ka.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado{
    private double tamanho;
    private String raca;

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
    }

    @Override
    public void amamentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void passear() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }
}
