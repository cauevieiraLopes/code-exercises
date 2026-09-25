package br.com.geometryCalculator.model;

public non-sealed class SquareFigure extends ModelFigure{
    private double size;

    public SquareFigure(double size) {
        setSize(size);
        calcularArea();
        System.out.println("A square with side " + getSize() + ", has an area of: " + getArea());
    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void calcularArea() {
        area = size * size;
    }

    @Override
    public double getArea() {
        return area;
    }
}
