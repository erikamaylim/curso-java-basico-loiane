package com.ka.cursojava.labs.ex135;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double saque) {
        if (this.getSaldo() - saque < 0) {
            System.out.printf("Saldo insuficiente para realizar o saque de R$ %,.2f. ", saque);
        } else {
            this.setSaldo(this.getSaldo() - saque);
            System.out.printf("Realizado saque de R$ %,.2f. ",saque);
        }
        obterSaldo();
    }

    public void depositar(double deposito) {
        this.setSaldo(this.getSaldo() + deposito);
        System.out.printf("Realizado depósito de R$ %,.2f. ", deposito);
        obterSaldo();
    }

    public void obterSaldo(){
        System.out.printf("Saldo atual: R$ %,.2f %n", this.getSaldo());
    }

    @Override
    public String toString() {
        return "Dados da Conta: \n" +
                "\tCliente: " + nomeCliente +
                "\n\tNúmero da Conta: " + numConta +
                "\n\tSaldo: R$ " + String.format("%,.2f", saldo);
    }
}
