package br.com.contaBancaria;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Servicos sv = new Servicos();

    public static void main(String[] args) {

        boolean continuar = true;

        sv.criarConta();

        //Menu de interação Principal
        while (continuar) {
            int opcao;

            System.out.println();
            System.out.println("[1] - Consultar saldo");
            System.out.println("[2] - Consultar cheque especial");
            System.out.println("[3] - Depositar dinheiro");
            System.out.println("[4] - Sacar dinheiro");
            System.out.println("[5] - Pagar um boleto.");
            System.out.println("[6] - Verificar se a conta está usando cheque especial.");
            System.out.println("[0] - Sair");
            opcao = sv.resultadoOpcao();

            switch (opcao) {
                case 1 -> sv.consultarSaldo();
                case 2 -> sv.consultarCheque();
                case 3 -> sv.depositarDinheiro();
                case 4 -> sv.sacarDinheiro();
                case 5 -> sv.pagarBoleto();
                case 6 -> sv.estaUsandoCheque();
                case 0 -> continuar = false;
            }
        }
    }
}
