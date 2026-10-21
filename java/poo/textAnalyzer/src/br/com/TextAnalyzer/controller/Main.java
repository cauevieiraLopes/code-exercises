package br.com.TextAnalyzer.controller;

import br.com.TextAnalyzer.service.TextService;

public class Main {

    static TextService ts = new TextService();

    static void main(String[] args) {
        ts.receberTexto();
    }
}
