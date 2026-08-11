package br.com.validador.modelo;

import br.com.validador.servico.Funcoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Digite seu primeiro nome no terminal para iniciar!");
            return;
        }

        String nome = args[0];

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        if(senha.length() < 8) {
            System.out.println("Digite uma senha com pelo menos 8 caracteres!");
            return;
        }

        boolean temNomeNaSenha = Funcoes.verificarNomeSenha(nome, senha);

        if(temNomeNaSenha) {
            System.out.println("Digite outra senha, a atual contém seu nome!");
            return;
        }

        boolean temSimbolos = Funcoes.verificarSimbolos(senha);

        if(temSimbolos) {
            System.out.println("A senha é forte!");
        } else {
            System.out.println("Digite outra senha, a atual não contém simbolos!");
            return;
        }

        sc.close();
    }
}
