package br.com.geometryCalculator.model;

public non-sealed class SquareFigure extends ModelFigure{
    private double size;

    public SquareFigure() {

    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public void calcularArea() {
        area = size * size;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = size * 4;
    }
}
