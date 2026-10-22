package br.com.taskList.service;

import br.com.taskList.model.ModelTask;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceTask {

    Scanner sc = new Scanner(System.in);
    private List<ModelTask> listaTarefas = new ArrayList<>();

    public void menu() {
        while (true) {
            System.out.println("Escolha uma opção abaixo");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Ver Lista de Tarefa");
            System.out.println("3. Concluir Tarefa");
            System.out.println("4. Sair");
            System.out.println("-------------------------");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();

            //Direcionamento para função correta!
            switch (opcao) {
                case 1 -> criarTarefa();
                case 2 -> {
                    System.out.println("\n-------------------------");
                    System.out.println("Lista de tarefas");
                    System.out.println("---------------------------");
                    verLista();
                }
                case 3 -> concluirTarefa();
                case 4 -> {
                    return;
                }
                default -> {
                    System.out.println("\n-------------------------");
                    System.out.println("Opção Inválida");
                    System.out.println("---------------------------");
                    menu();
                }
            }
        }
    }


    public void criarTarefa() {

        sc.nextLine();

        System.out.print("Digite a tarefa: ");
        String receberTarefa = sc.nextLine();

        //Criação do String builder e DateTime para melhor organização do texto
        StringBuilder builder = new StringBuilder();
        OffsetDateTime tempo = OffsetDateTime.now();

        //Formatação do horário exibido
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss XXX");

        //Criação da String com StringBuilder
        builder.append("[").append("Tarefa: ").append(receberTarefa).append(" | Criada: ").append(tempo.format(formato)).append("]");
        receberTarefa = builder.toString();

        //Atribuição ao Objeto
        ModelTask novaTarefa = new ModelTask(receberTarefa);

        System.out.println("Tarefa adicionada!");
        System.out.println("-------------------------");

        listaTarefas.add(novaTarefa);
    }

    public void concluirTarefa() {
        if (listaTarefas.isEmpty()) {
            System.out.println("Adicione uma tarefa para concluir ela!");
            System.out.println("-------------------------");
            menu();
        }

        int numeroDeItens;

        for (numeroDeItens = 0; numeroDeItens < listaTarefas.size(); numeroDeItens++) {
            System.out.println("[" + numeroDeItens + "]" + listaTarefas.get(numeroDeItens).getTask());
        }

        while (true) {
            System.out.println("-------------------------");
            System.out.print("Escolha a tarefa que quer concluir: ");
            int opcao = sc.nextInt();

            if (opcao < 0 || opcao > numeroDeItens - 1) {
                System.out.println("Escolha uma tarefa válida!");
            } else {
                listaTarefas.get(opcao).setStatus(true);

                OffsetDateTime tempo = OffsetDateTime.now();

                DateTimeFormatter formato =
                    DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss XXX");

                listaTarefas.get(opcao).setCompletionDay(tempo.format(formato));
                break;
            }
        }
    }

    public void verLista() {
        if (listaTarefas.isEmpty()) {
            System.out.println("A lista está vazia!");
            System.out.println("-------------------------");
            return;
        }

        for (ModelTask listaTarefa : listaTarefas) {
            System.out.println(listaTarefa.getTask());
            System.out.println("Tarefa concluida: " + listaTarefa.getStatus());
            if (listaTarefa.getStatus()) {
                System.out.println("Data de conclusão: " + listaTarefa.getCompletionDay());
            }
            System.out.println("--------------------------");
        }

        System.out.println("\n");
    }
}
