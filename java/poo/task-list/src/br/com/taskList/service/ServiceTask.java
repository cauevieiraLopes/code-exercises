package br.com.taskList.service;

import br.com.taskList.model.ModelTask;

import java.text.Normalizer;
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
            System.out.println("4. Excluir Tarefa");
            System.out.println("5. Sair");
            System.out.println("-------------------------");
            System.out.print("Opção: ");
            int opcao;

            while (!sc.hasNextInt()){
                System.out.println("Digite um número inteiro!");

                sc.next();

                System.out.print("Opção: ");
            }

            opcao = sc.nextInt();

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
                case 4 -> excluirTarefa();
                case 5 -> {
                    return;
                }
            }
            break;
        }
    }


    public void criarTarefa() {

        sc.nextLine();

        System.out.println("---------------------------");
        System.out.print("Digite a tarefa: ");
        String receberTarefa = sc.nextLine();

        //Normalizando o texto
        receberTarefa = receberTarefa.replaceAll("\\s+", " ").trim();
        receberTarefa = Normalizer.normalize(receberTarefa,
                Normalizer.Form.NFD).replaceAll("\\p{M}", "");

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
        menu();
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
            int opcao;

            while(!sc.hasNextInt()) {
                System.out.println("-------------------------");
                System.out.println("Digite um número inteiro!");

                sc.next();

                System.out.print("Escolha a tarefa que quer concluir: ");
            }

            opcao = sc.nextInt();

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

        menu();
    }

    public void verLista() {
        if (listaTarefas.isEmpty()) {
            System.out.println("A lista está vazia!");
            System.out.println("-------------------------");
            return;
        }

        for (int i = 0; i < listaTarefas.size(); i++){
            System.out.println("[" + i + "]" + listaTarefas.get(i).getTask());
            System.out.println("Tarefa concluida: " + listaTarefas.get(i).getStatus());
            if (listaTarefas.get(i).getStatus()) {
                System.out.println("Data de conclusão: " + listaTarefas.get(i).getCompletionDay());
            }
            System.out.println("--------------------------");
        }

        System.out.println();
        menu();
    }

    public void excluirTarefa() {
        if (listaTarefas.isEmpty()){
            System.out.println("A lista está vazia!\n");
            menu();
        }

        for (int i = 0; i < listaTarefas.size(); i++) {
            System.out.println("[" + i + "]" + listaTarefas.get(i).getTask());
        }

        System.out.print("\nQual tarefa deseja excluir: ");
        int option;

        while (!sc.hasNextInt()) {
            System.out.println("--------------------------");
            System.out.println("Digite um número inteiro!");

            sc.next();

            System.out.print("Qual tarefa deseja excluir: ");
        }

        option = sc.nextInt();

        if (option < 0 || option >= listaTarefas.size()) {
            System.out.println("\n--------------------------");
            System.out.println("Escolha uma tarefa válida!");
            System.out.println("--------------------------\n");
            menu();
        } else {
            listaTarefas.remove(option);
            System.out.println("Tarefa excluída!\n");
            menu();
        }
    }
}
