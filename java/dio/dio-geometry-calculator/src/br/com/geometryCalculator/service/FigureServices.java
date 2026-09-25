package br.com.geometryCalculator.service;

import br.com.geometryCalculator.model.CircleFigure;
import br.com.geometryCalculator.model.RectangleFigure;
import br.com.geometryCalculator.model.SquareFigure;

import java.util.Scanner;

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
        double size;

        System.out.println("===== SQUARE =====");
        do {
            System.out.print("Set size: ");
            size = sc.nextDouble();
        }while (size <= 0);

        SquareFigure squareFigure = new SquareFigure(size);
        sc.close();
    }

    public void rectangle() {
        double base, height;

        System.out.println("===== RECTANGLE =====");

        do {
            System.out.print("Set base: ");
            base = sc.nextDouble();
        }while (base <= 0);

        do {
            System.out.print("Set height: ");
            height = sc.nextDouble();
        }while (height <= 0);

        RectangleFigure rectangleFigure = new RectangleFigure(base, height);
        sc.close();
    }

    public void circle() {
        double radius;

        System.out.println("===== CIRCLE =====");
        do {
            System.out.print("Set radius: ");
            radius = sc.nextDouble();
        }while (radius <= 0);

        CircleFigure circleFigure = new CircleFigure(radius);
        sc.close();
    }
}
