package br.com.fibonacci.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long numero1 = 1;
        long numero2 = 0;
        long numero3 = numero1 + numero2;
        long limite = 0;

        do {
            System.out.print("Digite o limite da sequência: ");
            limite = sc.nextInt();
        } while (0 > limite);

        System.out.println(numero3);

        while (limite >= numero3) {
            System.out.println(numero3);

            numero2 = numero1;
            numero1 = numero3;
            numero3 = numero1 + numero2;
        }

        sc.close();
    }
}