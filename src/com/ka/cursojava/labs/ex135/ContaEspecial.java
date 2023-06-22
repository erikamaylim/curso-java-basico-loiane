package com.ka.cursojava.labs.ex135;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial() {
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double saque) {
        if (this.getSaldo() - saque < (-this.getLimite())) {
            System.out.printf("Saldo insuficiente para realizar o saque de R$ %,.2f. ", saque);
        } else {
            this.setSaldo(this.getSaldo() - saque);
            System.out.printf("Realizado saque de R$ %,.2f. ",saque);
        }
        obterSaldo();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tLimite: R$ " + String.format("%,.2f", this.getLimite());
    }
}
