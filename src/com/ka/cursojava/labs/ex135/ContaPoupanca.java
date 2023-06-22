package com.ka.cursojava.labs.ex135;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca() {}
    public ContaPoupanca(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        double rendimento = 0;
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            rendimento = (this.getSaldo() * (taxaRendimento / 100));
            System.out.printf("Rendimento de R$ %,.2f | ", rendimento);
            this.setSaldo(rendimento + this.getSaldo());
            System.out.printf("Novo saldo: R$ %,.2f %n", this.getSaldo());
        } else {
            System.out.printf("Não houve rendimento. Dia de rendimento: %d. %n", this.getDiaRendimento());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\tDia Rendimento: " + this.getDiaRendimento();
    }
}
