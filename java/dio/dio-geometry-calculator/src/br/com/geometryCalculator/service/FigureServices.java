package br.com.geometryCalculator.service;

import br.com.geometryCalculator.model.CircleFigure;
import br.com.geometryCalculator.model.RectangleFigure;
import br.com.geometryCalculator.model.SquareFigure;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class FigureServices {

    Scanner sc = new Scanner(System.in);

    public void setFigure() {
        System.out.println("===== SET FIGURE ====");
        System.out.println("[1] - Square");
        System.out.println("[2] - Rectangle");
        System.out.println("[3] - Circle");
        System.out.print("Option: ");
        int option = sc.nextInt();

        switch (option) {
            case 1 -> square();
            case 2 -> rectangle();
            case 3 -> circle();
            default -> throw new RuntimeException("""
                    \n===== ERROR =====
                     Invalid option
                    =================
                    """);
        }

    }

    public void square() {
        var ref = new Object() {
            double size;
        };

        SquareFigure quadrado = new SquareFigure();

        System.out.println("===== SQUARE =====");

        do {
            System.out.print("Set size: ");
            ref.size = sc.nextDouble();
        }while (ref.size <= 0);

        Function<SquareFigure, SquareFigure> perimetroQuadrado = squareFigure -> {
            squareFigure.setSize(ref.size);
            squareFigure.calcularPerimetro();

            return squareFigure;
        };

        Function<SquareFigure, SquareFigure> areaQuadrado = squareFigure -> {
            squareFigure.setSize(ref.size);
            squareFigure.calcularArea();

            return squareFigure;
        };

        Consumer<SquareFigure> exibirInformacoes = squareFigure -> {
            System.out.println("Um quadrado de lado: " + squareFigure.getSize());
            System.out.println("Possui área: " + squareFigure.getArea());
            System.out.println("Possui perímetro: " + squareFigure.getPerimetro());
        };

        Consumer<SquareFigure> pipeline = squareFigure -> {
            squareFigure = areaQuadrado.apply(squareFigure);
            squareFigure = perimetroQuadrado.apply(squareFigure);
            exibirInformacoes.accept(squareFigure);
        };

        pipeline.accept(quadrado);

        sc.close();
    }

    public void rectangle() {

        var ref = new Object() {
            double base, height;
        };

        RectangleFigure retangulo = new RectangleFigure();

        System.out.println("===== RECTANGLE =====");

        do {
            System.out.print("Set base: ");
            ref.base = sc.nextDouble();
        }while ( ref.base <= 0);

        do {
            System.out.print("Set height: ");
            ref.height = sc.nextDouble();
        }while ( ref.height <= 0);

        Function<RectangleFigure, RectangleFigure> calcularPerimetro = rectangleFigure -> {
            rectangleFigure.setHeight(ref.height);
            rectangleFigure.setBase(ref.base);
            rectangleFigure.calcularPerimetro();

            return rectangleFigure;
        };

        Function<RectangleFigure, RectangleFigure> calcularArea = rectangleFigure -> {
          rectangleFigure.setHeight(ref.height);
          rectangleFigure.setBase(ref.base);
          rectangleFigure.calcularArea();

          return rectangleFigure;
        };

        Consumer<RectangleFigure> exibirInformacoes = rectangleFigure -> {
            System.out.println("Retângulo de altura: " + rectangleFigure.getHeight());
            System.out.println("E base: " + rectangleFigure.getBase());
            System.out.println("Possui área: " + rectangleFigure.getArea());
            System.out.println("Possui perímetro: " + rectangleFigure.getPerimetro());
        };

        Consumer<RectangleFigure> pipeline = rectangleFigure -> {
            rectangleFigure = calcularArea.apply(rectangleFigure);
            rectangleFigure = calcularPerimetro.apply(rectangleFigure);
            exibirInformacoes.accept(rectangleFigure);
        };

        pipeline.accept(retangulo);

        sc.close();
    }

    public void circle() {

        var ref = new Object() {
            double radius;
        };

        CircleFigure circulo = new CircleFigure();

        System.out.println("===== CIRCLE =====");

        do {
            System.out.print("Set radius: ");
            ref.radius = sc.nextDouble();
        }while (ref.radius <= 0);

        Function<CircleFigure, CircleFigure> calcularPerimetro = circleFigure -> {
            circleFigure.setRadius(ref.radius);
            circleFigure.calcularPerimetro();

            return circleFigure;
        };

        Function<CircleFigure, CircleFigure> calcularArea = circleFigure -> {
          circleFigure.setRadius(ref.radius);
          circleFigure.calcularArea();

          return circleFigure;
        };

        Consumer<CircleFigure> exibirInformacoes = circleFigure -> {
            System.out.println("Um círculo de raio: " + circleFigure.getRadius());
            System.out.println("Possui área: " + circleFigure.getArea());
            System.out.println("Possui perímetro: " + circleFigure.getPerimetro());
        };

        Consumer<CircleFigure> pipeline = circleFigure -> {
          circleFigure = calcularArea.apply(circleFigure);
          circleFigure = calcularPerimetro.apply(circleFigure);
          exibirInformacoes.accept(circleFigure);
        };

        pipeline.accept(circulo);

        sc.close();
    }
}
