package br.com.contaBancaria;

import java.util.Scanner;

public class Servicos {


    Scanner sc = new Scanner(System.in);
    Conta novaConta = new Conta();

    //CRIAÇÃO DA CONTA (OBJETO)
    public void criarConta() {
        double saldo;

        do {
            System.out.print("Insira o valor do saldo inicial da conta: R$");
            saldo = sc.nextDouble();
        } while (saldo < 0);

        novaConta = new Conta(saldo);
    }

    //retornar valor de escolha
    public int resultadoOpcao() {
        int opcao = sc.nextInt();
        return opcao;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$" + novaConta.getSaldo());
    }


    public void consultarCheque() {
        System.out.println("Cheque Especial: R$" + novaConta.getChequeEspecial());
    }


    public void depositarDinheiro() {
        double deposito;
        double divida = novaConta.getChequeEspecialLimiteOriginal() - novaConta.getChequeEspecial() + ((novaConta.getChequeEspecialLimiteOriginal() - novaConta.getChequeEspecial()) * 0.2);

        do {
            System.out.print("Valor do deposito: R$");
            deposito = sc.nextDouble();
        } while (deposito < 0);

        if (novaConta.getChequeEspecial() != novaConta.getChequeEspecialLimiteOriginal() && deposito > divida) {
            System.out.println("Foi cobrado de você a dívida de 20% referente ao valor utilizado no cheque especial: R$" + divida);

            deposito -= divida;

            System.out.println("O seu cheque especial foi renovado e seu deposito foi efetuado com o valor de: R$" + deposito);

            novaConta.renovarCheque();
        } else if (novaConta.getSaldo() + deposito >= divida) {
            System.out.println("Foi cobrado de você a dívida de 20% referente ao valor utilizado no cheque especial: R$" + divida);

            novaConta.depositarSaldo(deposito);
            novaConta.subtrairSaldo(divida);
            novaConta.renovarCheque();

            return;
        }

        novaConta.depositarSaldo(deposito);
    }


    //METODO PARA RETIRAR DINHEIRO DA CONTA
    public void sacarDinheiro() {
        double saque = 0;

        do {
            System.out.print("Informe a quantidade desejada: R$");
            saque = sc.nextDouble();
        } while (saque < 0);

        if (saque > novaConta.getSaldo() && saque <= novaConta.getChequeEspecial() + novaConta.getSaldo()) {
            novaConta.usarChequeEspecial(saque - novaConta.getSaldo());
            novaConta.pagarDivida(saque - novaConta.getSaldo() + novaConta.getSaldo());
        } else if (saque > novaConta.getChequeEspecial() + novaConta.getSaldo()) {
            System.out.println("Você não consegue realizar este saque!");
            return;
        }

        novaConta.subtrairSaldo(saque);
    }


    //FUNÇÃO PRINCIPAL PARA PAGAR CONTAS/BOLETO E COBRAR O CHEQUE ESPECIAL
    public void pagarBoleto() {
        double valorBoleto, dividaChequeEspecial;

        //Cobrar valor caso utilize o cheque especial
        if (novaConta.getChequeEspecial() != novaConta.getChequeEspecialLimiteOriginal()) {
            dividaChequeEspecial = novaConta.getChequeEspecialLimiteOriginal() - novaConta.getChequeEspecial() + ((novaConta.getChequeEspecialLimiteOriginal() - novaConta.getChequeEspecial()) * 0.2);

            System.out.println("Você tem que pagar o valor referente ao cheque especial usado:");
            System.out.println("Valor do boleto: R$" + dividaChequeEspecial);

            //Verificar se o usuário pode realizar o pagamento com o saldo na conta
            if (novaConta.getSaldo() < dividaChequeEspecial) {
                System.out.println("Realize um deposito para pagar esse boleto!");
                System.out.println("Você ainda pode usar o restante do cheque especial!");
            } else {
                System.out.println("Digite:");
                System.out.println("[1] - Pagar");
                System.out.println("[x] - Digite outro número para pagar depois");
                valorBoleto = sc.nextInt();

                //Efetuar pagamento da dívida de 20%
                if ((int) valorBoleto == 1) {
                    novaConta.pagarDivida(novaConta.getSaldo() - dividaChequeEspecial);
                    novaConta.renovarCheque();
                    return;
                }
            }
        }


        //PROCESSO DE PAGAMENTO NORMAL DO BOLETO
        do {
            System.out.print("Digite o valor do boleto: R$");
            valorBoleto = sc.nextDouble();
        } while (valorBoleto <= 0);

        //Verificar se o saldo na conta é suficiente para realizar o pagamento ou precisa do cheque
        if (valorBoleto <= novaConta.getSaldo()) {
            novaConta.subtrairSaldo(valorBoleto);
        } else if (valorBoleto > novaConta.getSaldo() && valorBoleto <= novaConta.getSaldo() + novaConta.getChequeEspecial()) {
            double diferenca = valorBoleto - novaConta.getSaldo() ;
            valorBoleto = valorBoleto - diferenca;

            novaConta.usarChequeEspecial(diferenca);
            novaConta.subtrairSaldo(valorBoleto);
        } else { System.out.println("Você não possui saldo para efetuar o pagamento!"); }
    }


    public void estaUsandoCheque() {
        if (novaConta.getChequeEspecial() != novaConta.getChequeEspecialLimiteOriginal()) {
            System.out.println("Você está usando o cheque especial");
        } else { System.out.println("Você não está usando o cheque especial");}
    }
}