package br.com.geometryCalculator.controller;

import br.com.geometryCalculator.service.FigureServices;

public class Main {

    static FigureServices fs = new FigureServices();

    public static void main(String[] args) {

        try {
            fs.setFigure();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
