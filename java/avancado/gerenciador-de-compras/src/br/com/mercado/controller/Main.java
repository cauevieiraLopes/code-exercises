package br.com.mercado.controller;

import br.com.mercado.service.Servicos;

public class Main {

    static Servicos serv = new Servicos();

    public static void main(String[] args) {
        String mensagemErro = "";

        while (true) {

            try {
                //redirecionamento para o menu da mensagem de erro
                if (mensagemErro.contains("funcionário")) {
                    serv.menuFuncionario();
                } else if (mensagemErro.contains("Mensagem de erro")) {
                    serv.menu();
                } else {
                    serv.escolhaUsuario();
                }

            } catch (RuntimeException e) {
                mensagemErro = e.getMessage();

                //verificar solititação de finalizamento do sistema
                if (mensagemErro.equals("Sistema encerrado")) {
                    System.out.println(mensagemErro);
                    return;
                }

                //garantir que a mensagem não é nulo
                if (mensagemErro != null) {
                    System.out.println(mensagemErro);
                } else {
                    System.out.println("Erro inesperado, tente novamente");
                }
            }
        }
    }
}