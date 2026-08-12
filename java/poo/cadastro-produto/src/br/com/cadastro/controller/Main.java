package br.com.cadastro.controller;

import br.com.cadastro.service.Services;

import java.util.Scanner;

import br.com.cadastro.model.Produto;

public class Main {
    public static void main(String[] args) {

        //Criação das classes para leitura, guardar as informações do produto e exibir
        Scanner sc = new Scanner(System.in);
        Produto pd = new Produto();
        Services sv = new Services();

        //Receber as informações
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.print("Valor do produto: R$");
        double precoProduto = sc.nextDouble();

        //utilização do metodo set para atribuir valor nas variáveis privadas
        pd.setNameProduct(nomeProduto);
        pd.setValueProdutc(precoProduto);

        //exibir as informações atribuidas e fechar o Scanner
        sv.exibirProduto(pd);

        sc.close();
    }
}
