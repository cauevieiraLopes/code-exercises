package br.com.leituraNotas.controller;

import br.com.leituraNotas.model.Student;
import br.com.leituraNotas.service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declarar classes
        Student[] student = new Student[4];
        Scanner sc = new Scanner(System.in);
        Service ser = new Service();

        //Chamar funções
        ser.cadastrarEstudantes(student, sc);
        ser.adicionarMedia(student);
        ser.exibirResultado(student);

        sc.close();
    }
}
