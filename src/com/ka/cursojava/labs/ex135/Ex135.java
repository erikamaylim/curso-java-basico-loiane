package com.ka.cursojava.labs.ex135;

public class Ex135 {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("José", "111", 1000);
        ContaPoupanca cp = new ContaPoupanca("Maria", "222",1000, 23);
        ContaEspecial ce = new ContaEspecial("Carlos", "333", 100, 50);

//        cb.depositar(200);
//        cb.sacar(1000);
//        cb.sacar(200);
//        cb.sacar(1);
//        cb.obterSaldo();
//        System.out.println(cb);

//        cp.depositar(100);
//        cp.sacar(600);
//        cp.calcularNovoSaldo(2);
//        System.out.println(cp);

        ce.obterSaldo();
        System.out.println(ce.getLimite());
        ce.sacar(50);
        ce.sacar(70);
        ce.sacar(80);
        System.out.println(ce);



    }
}
