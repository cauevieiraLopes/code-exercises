package br.com.cadastro.controller;

import br.com.cadastro.service.Services;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.print("Valor do produto: R$");
        double precoProduto = sc.nextDouble();

        Services sv = new Services();

        sv.cadastrarProduto(nomeProduto, precoProduto);

        sc.close();
    }
}
