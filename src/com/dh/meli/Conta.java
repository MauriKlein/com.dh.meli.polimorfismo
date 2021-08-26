package com.dh.meli;

public class Conta {
    double valor;

    public void fazerDeposito(double valor){
        this.valor = this.valor + valor;
    }

    public double getValor() {
        return valor;
    }

    public void mostrarSaldo() {
        System.out.println("Seu saldo é = "+ valor);
    }
}
