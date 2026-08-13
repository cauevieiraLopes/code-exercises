package br.com.leituraNotas.service;

import br.com.leituraNotas.model.Student;

import java.util.Scanner;

public class Service {

    public void cadastrarEstudantes(Student[] st, Scanner sc) {
        for (int i = 0; i < 4; i++) {
            String name;
            double math;
            double english;
            double science;
            double portuguese;

            //nextLine adicionado para não quebrar a leitura do nome
            if (i > 0) {
                sc.nextLine();
            }

            //Adicionar Notas e verificar inetervalo
            System.out.print("Nome do aluno:");
            name = sc.nextLine();

            System.out.print("Nota de matemática: ");
            math = sc.nextDouble();

            //Matématica
            if(math > 10 || math < 0) {
                System.out.println("O intervalo das notas é entre 0 e 10!");

                while (math > 10 || math < 0) {
                    System.out.print("Nota de matemática: ");
                    math = sc.nextDouble();
                }
            }

            //Inglês
            System.out.print("Nota de inglês: ");
            english = sc.nextDouble();

            if(english > 10 || english < 0) {
                System.out.println("O intervalo das notas é entre 0 e 10!");

                while (english > 10 || english < 0) {
                    System.out.print("Nota de inglês: ");
                    english = sc.nextDouble();
                }
            }

            //Ciências
            System.out.print("Nota de ciências: ");
            science = sc.nextDouble();

            if(science > 10 || science < 0) {
                System.out.println("O intervalo das notas é entre 0 e 10!");

                while(science > 10 || science < 0) {
                    System.out.print("Nota de ciências: ");
                    science = sc.nextDouble();
                }
            }

            //Português
            System.out.print("Nota de português: ");
            portuguese = sc.nextDouble();

            if(portuguese > 10 || portuguese < 0) {
                System.out.println("O intervalo das notas é entre 0 e 10!");

                while(portuguese > 10 || portuguese < 0) {
                    System.out.print("Nota de português: ");
                    portuguese = sc.nextDouble();
                }
            }

            System.out.println("------------------------------");

            //Declarar novo estudante para adicionar objetos no array
            st[i] = new Student();

            st[i].setStudentName(name);
            st[i].setEnglishGrade(english);
            st[i].setMathGrade(math);
            st[i].setPortugueseGrade(portuguese);
            st[i].setScienceGrade(science);
        }
    }

    public void adicionarMedia(Student[] st) {
        for (int i = 0; i < 4; i++) {
            st[i].setMedia((st[i].getScienceGrade() + st[i].getEnglishGrade() + st[i].getMathGrade() + st[i].getPortugueseGrade()) / 4);
        }
    }

    public void exibirResultado(Student[] st) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Nome: " + st[i].getStudentName());
            System.out.println("Nota de matemática: " + st[i].getMathGrade());
            System.out.println("Nota de português: " + st[i].getPortugueseGrade());
            System.out.println("Nota de ciências: " + st[i].getScienceGrade());
            System.out.println("Nota de inglês: " + st[i].getEnglishGrade());
            System.out.println("Média: " + st[i].getMedia());

            if (st[i].getMedia() > 7) {
                System.out.println("Resultado: Aprovado!");
            } else System.out.println("Resultado: Reprovado!");

            System.out.println("-----------------------------------");
        }
    }
}
