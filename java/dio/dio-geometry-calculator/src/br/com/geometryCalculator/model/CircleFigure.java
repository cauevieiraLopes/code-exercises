package br.com.geometryCalculator.model;

public non-sealed class CircleFigure extends ModelFigure {
    private final double pi = 3.14159;
    private double radius;

    public CircleFigure() {

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void calcularArea() {
        area = pi * (radius * radius);
    }

    @Override
    public void calcularPerimetro() {
        perimetro = 2 * pi * radius;
    }
}
