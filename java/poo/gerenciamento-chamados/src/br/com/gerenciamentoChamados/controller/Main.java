package br.com.gerenciamentoChamados.controller;

import br.com.gerenciamentoChamados.services.ServiceChamado;

public class Main {

    static ServiceChamado sch = new ServiceChamado();

    public static void main(String[] args) {

        while (true) {
            int opcao;

            String builder = """
                \n===== SISTEMA DE CHAMADOS =====
                1 - Cadastrar chamado
                2 - Consultar chamado
                3 - Listar chamados
                4 - Alterar status
                0 - Sair""";

            System.out.println(builder + "\n");

            opcao = sch.verificarTipoDeEntrada();
            if(opcao == 0) return;

            switch (opcao) {
                case 1 -> sch.cadastrarChamado();
                case 2 -> sch.consultarChamado();
                case 3 -> sch.listarChamados();
                case 4 -> sch.alterarStatus();
                default -> {
                    System.out.println("\n========= Erro =========\n" +
                            "Selecione uma opção válida da lista\n" +
                            "========================");
                }
            }
        }
    }
}