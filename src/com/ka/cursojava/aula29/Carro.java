package com.ka.cursojava.aula29;

public class Carro {
    private String marca;
    private String modelo;
    private Integer numeroPassageiros;
    private Double capacidadeCombustivel;
    private Double consumoCombustivel;

    public Carro(String marca, String modelo, Integer numeroPassageiros, Double capacidadeCombustivel, Double consumoCombustivel) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setNumeroPassageiros(numeroPassageiros);
        this.setCapacidadeCombustivel(capacidadeCombustivel);
        this.setConsumoCombustivel(consumoCombustivel);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(Integer numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public Double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(Double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public Double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(Double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    @Override
    public String toString() {
        return "{" +
                "marca: '" + marca + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", numeroPassageiros: " + numeroPassageiros +
                ", capacidadeCombustivel: " + capacidadeCombustivel +
                ", consumoCombustivel: " + consumoCombustivel +
                '}';
    }
}
