package com.dh.meli;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //Testando a conta poupança
        Conta poupanca = new ContaPoupanca();
        poupanca.fazerDeposito(1000);
        poupanca.mostrarSaldo();//método que caracteriza polimorfismo

        //Testando a conta poupança
        Conta corrente = new ContaCorrente();
        corrente.fazerDeposito(1000);
        corrente.mostrarSaldo();//método que caracteriza polimorfismo




    }
}
