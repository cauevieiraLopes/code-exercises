package br.com.geometryCalculator.model;

public non-sealed class CircleFigure extends ModelFigure {
    private final double pi = 3.14;
    private double radius;

    public CircleFigure(double radius) {
        setRadius(radius);
        calcularArea();
        System.out.println("a circle with radius " + getRadius() +", has: " + getArea() + " area");
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }

    @Override
    public void calcularArea() {
        area = pi * (radius * radius);
    }

    @Override
    public double getArea() {
        return area;
    }
}
