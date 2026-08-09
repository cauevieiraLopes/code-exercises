package br.com.palimdromo;

import java.util.Scanner;

import br.com.palimdromo.funcoes.Funcoes;

public class Main {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra: ");
        String texto = sc.nextLine();

        //Remover os caracteres que geram conflito e deixar os caracteres em maiúsculo para facilitar a identificação
        texto = texto.replace(" ", "");
        texto = texto.replace(",", "");
        texto = texto.replace(".", "");
        texto = texto.replace("!", "");
        texto = texto.replace("?", "");
        texto = texto.replace("-", "");
        texto = texto.toUpperCase();

        boolean ePalimdromo = Funcoes.comparar(texto);

        if(ePalimdromo) System.out.println("É um palíndromo.");
        else {
            System.out.println("Não é um palíndromo.");
        }
    }
}