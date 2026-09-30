package br.com.geometryCalculator.model;

public abstract sealed class ModelFigure implements InterfaceFigure permits SquareFigure, RectangleFigure, CircleFigure{
    protected double area;

    @Override
    public void calcularArea() {

    }

    @Override
    public double getArea() {
        return area;
    }
}
