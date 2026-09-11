package br.com.contaBancaria;

public class Conta {

    private double saldo;
    private double chequeEspecialLimiteDisponivel;
    private double chequeEspecialLimiteOriginal;

    //Construtores
    public Conta () {

    }

    public Conta (double saldo) {
        this.saldo = saldo;

        this.chequeEspecialLimiteDisponivel = (saldo <= 500) ? 50 : saldo/2;
        this.chequeEspecialLimiteOriginal = chequeEspecialLimiteDisponivel;
    }

    //puxar o valor do saldo
    public double getSaldo() {
        return saldo;
    }

    //puxar o valor do cheque atual
    public double getChequeEspecial() {
        return chequeEspecialLimiteDisponivel;
    }

    //usar valor do cheque
    public void usarChequeEspecial(double valor) {
        this.chequeEspecialLimiteDisponivel -= valor;
    }

    //puxar o valor total do cheque
    public double getChequeEspecialLimiteOriginal() {
        return chequeEspecialLimiteOriginal;
    }

    //depositar dinheiro no saldo
    public void depositarSaldo(double saldo) {
        this.saldo = this.saldo + saldo;
    }

    //usar o valor do cheque especial
    public void pagarDivida(double valor) {
        this.saldo = valor;
    }

    //retirar dinheiro
    public void subtrairSaldo(double saque) {
        this.saldo -= saque;
    }

    public void renovarCheque() {
        this.chequeEspecialLimiteDisponivel = this.chequeEspecialLimiteOriginal;
    }
}
