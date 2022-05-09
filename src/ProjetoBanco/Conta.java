package ProjetoBanco;

import javax.swing.*;

public abstract class Conta implements Iconta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected   double saldo;

    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = 1;
        this.conta = SEQUENCIAL ++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
       this.saldo = saldo + valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
      this.sacar(valor);
      contaDestino.depositar(valor);
    }

    public void sacar(){

    }
    public void depositar(){

    }
    public void transferir(){

    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}

