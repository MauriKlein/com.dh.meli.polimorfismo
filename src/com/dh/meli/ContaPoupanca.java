package com.dh.meli;

public class ContaPoupanca extends Conta{

    //Este método sobrescreve o metodo mostrarSaldo() de Conta
    //Ele possui a mesma assinatura porém com comportamento diferente
    //Assim caracteriza polimorfismo
    @Override
    public void mostrarSaldo() {
        System.out.println("Saldo da Paupança = "+ valor);
    }

}
