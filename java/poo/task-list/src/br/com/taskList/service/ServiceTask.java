package br.com.taskList.service;

import br.com.taskList.model.ModelTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceTask {

    private List<ModelTask> listaTarefas = new ArrayList<>();

    public void criarTarefa(Scanner sc) {

        sc.nextLine();

        System.out.print("Digite a tarefa: ");
        String receberTarefa = sc.nextLine();

        ModelTask novaTarefa = new ModelTask(receberTarefa);

        System.out.println("Tarefa adicionada!");
        System.out.println("-------------------------");

        listaTarefas.add(novaTarefa);
    }

    public void concluirTarefa(Scanner sc) {
        if (listaTarefas.isEmpty()) {
            System.out.println("Adicione uma tarefa para concluir ela!");
            System.out.println("-------------------------");
            return;
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
                continue;
            } else {
                listaTarefas.get(opcao).setStatus(true);
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
            System.out.println("--------------------------");
        }

        System.out.println("\n");
    }
}
