package com.ka.cursojava.labs.ex125;

public class ContaCorrente {
    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteChequeEspecial;
    private double saldo;


    public ContaCorrente(String numero, String agencia, double saldo) {
        this.setNumero(numero);
        this.setAgencia(agencia);
        this.setEspecial(true);
        this.setLimiteChequeEspecial(500);
        this.setSaldo(saldo);
    }

    private String getNumero() {
        return numero;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    private String getAgencia() {
        return agencia;
    }

    private void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    private boolean isEspecial() {
        return especial;
    }

    private void setEspecial(boolean especial) {
        this.especial = especial;
    }

    private double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    private void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void realizarSaque(double valorASacar) {
        if (this.getSaldo() >= valorASacar) {
            this.setSaldo(this.getSaldo() - valorASacar);
            System.out.printf("Saque de R$ %,.2f realizado com sucesso. %n", valorASacar);
        } else {
            if (this.isEspecial()) {
                double limite = this.getLimiteChequeEspecial() + this.getSaldo();
                if (limite >= valorASacar) {
                    this.setSaldo(this.getSaldo() - valorASacar);
                    System.out.printf("Saque de R$ %,.2f realizado com sucesso. %n", valorASacar);
                } else {
                    System.out.printf("Saldo insuficiente. Não foi possível realizar o saque de R$ %,.2f. %n",
                            valorASacar);
                }
            } else {
                System.out.printf("Saldo insuficiente. Não foi possível realizar o saque de R$ %,.2f %n.", valorASacar);
            }
        }
        consultarSaldo();
    }

    void depositar(double valorDepositado) {
        this.setSaldo(this.getSaldo() + valorDepositado);
        System.out.printf("Depósito de R$ %,.2f efetuado com sucesso. %n", valorDepositado);
        consultarSaldo();
    }

    void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %,.2f %n", this.getSaldo());
    }

    void verificarUsoChequeEspecial() {
        if (this.getSaldo() < 0) {
            System.out.println("Está usando cheque especial.");
        } else {
            System.out.println("Não está usando cheque especial.");
        }
    }

    @Override
    public String toString() {
        return "{" +
                "numero: '" + numero + '\'' +
                ", agencia: '" + agencia + '\'' +
                ", especial: " + especial +
                ", limiteChequeEspecial: " + limiteChequeEspecial +
                ", saldo: " + saldo +
                '}';
    }
}
