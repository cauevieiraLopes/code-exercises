package br.com.taskList.controller;

import br.com.taskList.service.ServiceTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ServiceTask serviceTask = new ServiceTask();

        while (true) {
            System.out.println("Escolha uma opção abaixo");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Ver Lista de Tarefa");
            System.out.println("3. Concluir Tarefa");
            System.out.println("4. Sair");
            System.out.println("-------------------------");
            System.out.print("Opção: ");

            int opcao = sc.nextInt();

            //Validação de escolha
            if (opcao > 4 || opcao < 1) {
                System.out.println("\n-------------------------");
                System.out.println("Escolha uma opção válida!");
                System.out.println("-------------------------\n");
                continue;
            }

            //Direcionamento para função correta!
            switch (opcao) {
                case 1:
                    serviceTask.criarTarefa(sc);
                    break;
                case 2:
                    System.out.println("\n-------------------------");
                    System.out.println("Lista de tarefas");
                    System.out.println("---------------------------");
                    serviceTask.verLista();
                    break;
                case 3:
                    serviceTask.concluirTarefa(sc);
                    break;
                case 4:
                    return;
            }
        }
    }
}
