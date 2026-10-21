package br.com.geometryCalculator.model;

public non-sealed class RectangleFigure extends ModelFigure{
    private double base;
    private double height;

    public RectangleFigure() {

    }


    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    @Override
    public void calcularArea() {
        area = base * height;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = (base * 2) + (height * 2);
    }
}
