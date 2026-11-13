package br.com.gerenciamentoChamados.services;

import br.com.gerenciamentoChamados.model.Chamado;
import br.com.gerenciamentoChamados.model.StatusChamado;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class ServiceChamado {

    Scanner sc = new Scanner(System.in);
    ArrayList<Chamado> listaChamados = new ArrayList<>();
    int ID_Chamado = 1;

    /*
    METODO PARA VERIFICACAO DE TIPO INTEIRO
     */
    public int verificarTipoDeEntrada() {
        int numero;

        System.out.print("Opção: ");

        //VERIFICAR SE A ENTRADA NÃO E UM NÚMERO INTEIRO
        while (!sc.hasNextInt()) {
            System.out.println("\n===== Erro de tipo =====\n" +
                    "Digite um número inteiro!\n" +
                    "========================\n");

            sc.next();

            System.out.print("Opção: ");
        }

        numero = sc.nextInt();

        return numero;
    }



    public void cadastrarChamado() {
        System.out.println("\n===== CADASTRAR CHAMADO =====");
        System.out.print("Informe o título: ");
        String titulo = sc.nextLine(); //Erro quando a função é chamada e o título não recebe valor, "sc.next()" não resolveu o problema!
        titulo = sc.nextLine().trim().toLowerCase().replaceAll("\\s+", " ");

        System.out.print("Informe a descrição: ");
        String descricao = sc.nextLine().trim().toLowerCase().replaceAll("\\s+", " ");;

        Chamado chamado = new Chamado(titulo, descricao, ID_Chamado);
        ID_Chamado++; //Garantir que cada ID seja unico

        listaChamados.add(chamado);
    }



    public Optional<Chamado> buscarID(int id_busca) {
        for (Chamado chamado : listaChamados) {

            if (chamado.getID() == id_busca) {
                return Optional.of(chamado);
            }
        }
        return Optional.empty();
    }

    public void consultarChamado() {
        if (listaChamados.isEmpty()) {
            System.out.println("\n========= Erro =========\n" +
                    "Você não tem nenhum chamado na lista!\n" +
                    "========================\n");
            return;
        }

        System.out.println("\n===== CONSULTAR CHAMADO =====");
        System.out.println("Digite o ID do chamado abaixo");

        int id_busca = verificarTipoDeEntrada();

        buscarID(id_busca).ifPresentOrElse(chamado -> {
            StringBuilder builder = new StringBuilder();

            builder.append("\n===== CHAMADO ENCONTRADO =====").append("\nID: ").append(chamado.getID()).append("\nData de criação: ").append(chamado.getData())
                            .append("\nTítulo: ").append(chamado.getTitulo()).append("\nDescrição: ").append(chamado.getDescricao()).append("\nStatus: ").append(chamado.getStatus());

                    if (chamado.getStatus() == StatusChamado.FINALIZADO) {
                        builder.append("\nData de finalização: ").append(chamado.getDataFinalizacao());
                    }

                    builder.append("\n");

                    System.out.print(builder);

                    builder.delete(0, builder.length());
                },
                () -> System.out.println("Chamado com ID " + id_busca + " não foi encontrado.")
        );
    }



    public void listarChamados() {
        if (listaChamados.isEmpty()) {
            System.out.println("\n========= Erro =========\n" +
                    "Você não tem nenhum chamado na lista!\n" +
                    "========================\n");
            return;
        }

        System.out.println("\n===== LISTA DE CHAMADOS =====");

        for (Chamado chamados : listaChamados) {
            StringBuilder builder = new StringBuilder();

            builder.append("\n===== CHAMADO ").append(chamados.getID()).append(" =====\n").append("Título: ").append(chamados.getTitulo())
                    .append("\nDescrição: ").append(chamados.getDescricao()).append("\nStatus: ").append(chamados.getStatus()).append("\nData de abertura: ").append(chamados.getData());

            if (chamados.getStatus() == StatusChamado.FINALIZADO) {
                builder.append("\nData de finalização: ").append(chamados.getDataFinalizacao());
            }

            System.out.println(builder);

            builder.delete(0, builder.length());
        }
    }



    public void alterarStatus() {
        if(listaChamados.isEmpty()) {
            System.out.println("\n========= Erro =========\n" +
                    "Você não tem nenhum chamado na lista!\n" +
                    "========================\n");
            return;
        }

        System.out.println("\n===== CADASTRAR CHAMADO =====");

        int id_busca;

        System.out.println("Digite o ID do chamado que deseja concluir");
        id_busca = verificarTipoDeEntrada();

        buscarID(id_busca).ifPresentOrElse( chamado -> {
            if (chamado.getStatus() == StatusChamado.ABERTO) {
                OffsetDateTime dataFinalizacao = OffsetDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss Z");

                chamado.setDataFinalizacao(dataFinalizacao.format(formato));

                chamado.setStatus();

                StringBuilder builder = new StringBuilder();
                builder.append("\nChamado encontrado e conluído!").append("\nTítulo: ").append(chamado.getTitulo()).append("\nDescrição: ").append(chamado.getDescricao())
                        .append("\nData de solicitação: ").append(chamado.getData()).append("\nData de finalização: ").append(chamado.getDataFinalizacao()).append("\nStatus: ").append(chamado.getStatus());

                System.out.println(builder);
            } else {
                System.out.println("Chamado já finalizado!");
            }
        }, () -> System.out.println("Chamado não localizado!"));
    }
}
