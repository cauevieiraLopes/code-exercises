package br.com.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int desconto = 10;

        System.out.println("Qual o preço do produto?");
        double preco = sc.nextDouble();
        sc.nextLine();

        System.out.print("nome do produto: ");
        String nome = sc.nextLine();

        double novoPreco = preco - ((preco * desconto) / 100);

        System.out.println("O item: " + nome + ", com desconto de 10% ficou R$ " + novoPreco);

        sc.close();
    }
}