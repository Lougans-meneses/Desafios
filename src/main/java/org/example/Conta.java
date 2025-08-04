package org.example;

public class Conta {
    private String nome;
    private String numero;
    private double saldo;

    private static final double taxaOperacao = 0.50;

    public Conta(String nome, String numero, double saldoInicial) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public boolean depositar(double valor){
        if (valor > 0){
            saldo += valor - taxaOperacao;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        double total = valor + taxaOperacao;
        if (saldo > 0 && saldo >= total){
            saldo -= total;
            return true;
        }
        return false;
    }

    public boolean transferir(Conta destino, double valor){
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public boolean pagar(double valor){
        return sacar(valor);
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
