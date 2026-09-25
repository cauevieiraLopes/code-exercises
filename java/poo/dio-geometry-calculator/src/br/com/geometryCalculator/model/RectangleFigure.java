package br.com.geometryCalculator.model;

public non-sealed class RectangleFigure extends ModelFigure{
    private double base;
    private double height;

    public RectangleFigure(double base, double height) {
        setBase(base);
        setHeight(height);
        calcularArea();
        System.out.println("a rectangle with base " + getBase() + " and height " + getHeight() + " has area: " + getArea());
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getBase() {
        return base;
    }

    @Override
    public void calcularArea() {
        area = base * height;
    }

    @Override
    public double getArea() {
        return area;
    }
}
