package com.ka.cursojava.labs.ex121;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteChequeEspecial;
    double valorUsadoChequeEspecial;
    double saldo;

    void realizarSaque(double valorASacar) {
        if (saldo >= valorASacar) {
            saldo -= valorASacar;
            System.out.printf("Saque de R$ %,.2f realizado com sucesso. %n", valorASacar);
            consultarSaldo();
        } else {
            if (especial) {
                double limite = limiteChequeEspecial + saldo;
                if (limite >= valorASacar) {
                    saldo -= valorASacar;
                    System.out.printf("Saque de R$ %,.2f realizado com sucesso. %n", valorASacar);
                    consultarSaldo();
                } else {
                    System.out.printf("Saldo insuficiente. Não foi possível realizar o saque de R$ %,.2f. %n",
                            valorASacar);
                }
            } else {
                System.out.printf("Saldo insuficiente. Não foi possível realizar o saque de R$ %,.2f %n.", valorASacar);
            }
        }
    }

    void depositar(double valorDepositado) {
        saldo += valorDepositado;
        System.out.printf("Depósito de R$ %,.2f efetuado com sucesso. \nSaldo atual: R$ %,.2f %n", valorDepositado,
                saldo);

    }

    void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %,.2f %n", saldo);
    }

    void verificarUsoChequeEspecial() {
        if (saldo < 0) {
            System.out.println("Está usando cheque especial.");
        } else {
            System.out.println("Não está usando cheque especial.");
        }
    }

}
