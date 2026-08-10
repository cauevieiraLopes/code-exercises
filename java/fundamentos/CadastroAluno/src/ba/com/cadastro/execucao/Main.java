package ba.com.cadastro.execucao;

import ba.com.cadastro.dado.Aluno;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno(a): ");
        String name = sc.nextLine();

        name = name.trim();
        name = name.toUpperCase();

        System.out.print("Digite a média do aluno(a): ");
        double mediaAluno = sc.nextDouble();

        if(mediaAluno < 0 || mediaAluno > 10) {
            System.out.println("A media do aluno tem que estar entre 0 e 10!");

            do {
                System.out.print("Digite a média do aluno(a): ");
                mediaAluno = sc.nextDouble();
            }while (mediaAluno < 0 || mediaAluno > 10);
        }

        Aluno Aluno = new Aluno(name, mediaAluno);

        System.out.println("Aluno registrado!");
        System.out.println("Nome: " + Aluno.nome);
        System.out.println("Média: " + Aluno.media);

        sc.close();
    }
}
