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





    //Funções para a figura de quadrado
    @Override
    public void setSize(double size) {

    }

    @Override
    public double getSize() {
        return  0;
    }





    //Funções para a figura de retângulo
    @Override
    public void setHeight(double height) {

    }

    @Override
    public void setBase(double base) {

    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getBase() {
        return 0;
    }



    //Funções para a figura de retangulo
    @Override
    public void setRadius(double radius) {

    }

    @Override
    public double getRadius() {
        return 0;
    }
}
