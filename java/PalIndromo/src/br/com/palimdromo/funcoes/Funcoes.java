package br.com.palimdromo.funcoes;

public class Funcoes {

    public static boolean Comparar(String texto) {
        int extrairNumeroOposto = 0;
        int contador = 0;

        for(int i = texto.length() - 1; i > -1; i--) {
            char letra = texto.charAt(i);

            if(letra == texto.charAt(extrairNumeroOposto)) {
                contador++;
            }

            extrairNumeroOposto++;
        }

        if(contador == texto.length()) return true;
        else {
            return false;
        }
    }
}
