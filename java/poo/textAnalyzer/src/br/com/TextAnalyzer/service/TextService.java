package br.com.TextAnalyzer.service;

import br.com.TextAnalyzer.model.Text;

import java.util.Scanner;

public class TextService {

    Scanner sc = new Scanner(System.in);
    Text text = new Text();

    public void receberTexto() {
        System.out.print("Digite um texto: ");
        String textoSimples = sc.nextLine().trim();

        //Verificar se o texto está vazio
        if(textoSimples.isEmpty()) {
            System.out.println("O seu texto está vazio !");
            receberTexto();
        }

        text.setTextoSimples(textoSimples);

        menu();
    }


    public void menu() {
        System.out.println("========== TEXT ANALYZER ==========\n");
        System.out.println("1. Contar caracteres");
        System.out.println("2. Contar palavras");
        System.out.println("3. Encontrar uma palavra");
        System.out.println("4. Substituir uma palavra");
        System.out.println("5. Extrair parte do texto");
        System.out.println("6. Exibir palavras separadamente");
        System.out.println("7. Exibir estatísticas completas");
        System.out.println("0. Sair\n");
        System.out.println("Escolha uma opção: ");
        int option = sc.nextInt();

        switch (option) {
            case 0 -> {
                return;
            }
            case 1 -> contarCaracter();
            case 2 -> contarPalavras();
            case 3 -> encontrarPalavra();
            case 4 -> substituirPalavra();
            case 5 -> extrairTexto();
            case 6 -> exibirPalavrasSeparadamente();
            case 7 -> exibirTudo();
            default -> {
                System.out.println("\nOpção inválida!\n");
                menu();
            }
        }
    }

    public void contarCaracter() {
        System.out.println("========== CONTAGEM DE CARACTERES ==========\n");
        System.out.println("Texto: " + text.getTextoSimples());
        System.out.println("Quantidade de caracteres: " + text.getTextoSimples().length() + "\n");

        menu();
    }

    public void contarPalavras() {
        System.out.println("========== CONTAGEM DE PALAVRAS ==========\n");
        System.out.println("Texto: " + text.getTextoSimples());

        String[] palavras = text.getTextoSimples().split(" ");

        System.out.println("Quantidade de palavras: " + palavras.length + "\n");

        menu();
    }

    public void encontrarPalavra() {
        sc.nextLine();

        System.out.print("Digite a palavra que deseja encontrar: ");
        String alvo = sc.nextLine().toUpperCase().trim();
        String texto = text.getTextoSimples().toUpperCase();

        if (texto.contains(alvo)) {
            System.out.println("Palavra encontrada!");
            System.out.println("Posição inicial: " + texto.indexOf(alvo));
        } else {
            System.out.println("A palavra não está no texto!");
        }

        menu();
    }

    public void substituirPalavra() {
        sc.nextLine();

        System.out.println("========== SUBSTITUIR PALAVRA ==========\n");
        System.out.print("Palavra que deseja substituir: ");
        String alvo = sc.nextLine();

        System.out.print("Palavra a substituir: ");
        String substituta = sc.nextLine();

        int option;

        //Garantir que os resultados sejam 1 ou 2
        do {
            System.out.println("\n1. Substituir todas as ocorrências");
            System.out.println("2. Substituir apenas a primeira ocorrência");
            System.out.print("Opção: ");
            option = sc.nextInt();
        }while (option > 2 || option < 1);

        String texto = text.getTextoSimples();
        if (option == 1) {
            texto = texto.replace(alvo, substituta);
        } else {
            texto = texto.replaceFirst(alvo, substituta);
        }
        System.out.println("\nTexto: " + texto + "\n");

        menu();
    }

    public void extrairTexto() {
        int indiceInicial, indiceFinal;

        System.out.println("Seu texto possui: " + text.getTextoSimples().length() + " caracteres");

        do {
            System.out.print("Índice inicial: ");
            indiceInicial = sc.nextInt();
        }while (indiceInicial < 0 || indiceInicial >= text.getTextoSimples().length());

        do {
            System.out.print("Índice final: ");
            indiceFinal = sc.nextInt();
        }while (indiceFinal <= indiceInicial || indiceFinal > text.getTextoSimples().length());

        String texto = text.getTextoSimples();

        System.out.println("\nResultado: " + texto.substring(indiceInicial, indiceFinal) + "\n");

        menu();
    }

    public void exibirPalavrasSeparadamente() {
        String[] palavras = text.getTextoSimples().split(" ");

        for (String i : palavras) {
            System.out.println(i);
        }

        System.out.println();
        menu();
    }

    public void exibirTudo() {
        String[] palavras = text.getTextoSimples().split(" ");
        int vogal = 0, consoante = 0, espaco = 0, num = 0;

        //Contar vogais e consoantes
        for (int i = 0; i < text.getTextoSimples().length(); i++){
            char caracter = text.getTextoSimples().toLowerCase().charAt(i);

            if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                vogal += 1;
            } else if ((caracter >= 'a' && caracter <= 'z') && !(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')) {
                consoante += 1;
            } else if(caracter == '0' || caracter == '1' || caracter == '2' || caracter == '3' || caracter == '4' || caracter == '5' || caracter == '6' || caracter == '7' || caracter == '8' || caracter == '9') {
                num += 1;
            } else if (caracter == ' ') {
                espaco += 1;
            }
        }

        System.out.println("Quantidade de caracteres: " + text.getTextoSimples().length());
        System.out.println("Quantidade de palavras: " + palavras.length);
        System.out.println("Quantidade de vogais: " + vogal);
        System.out.println("Quantidade de consoante: " + consoante);
        System.out.println("Quantidade de espacos: " + espaco);
        System.out.println("Quantidade de numeros: " + num);

        menu();
    }
}
