package br.com.validador.servico;

public class Funcoes {

    public static boolean verificarNomeSenha(String nome, String senha) {
        senha = senha.toLowerCase();

        if(senha.contains(nome.toLowerCase())) {
            return true;
        } else if (senha.contains(nome.toUpperCase())) {
            return true;
        } else if (senha.contains(nome)) {
            return true;
        } else return false;
    }

    public static boolean verificarSimbolos(String senha) {
        String simbolos = "?!#@&^~%`()[]-+_/;|´";

        for(int i = 0; i < simbolos.length(); i++) {
            char simbolo = simbolos.charAt(i);

            if(senha.contains(String.valueOf(simbolo))) {
                return true;
            }
        }

        return false;
    }
}
