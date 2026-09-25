package br.com.geometryCalculator.model;

public interface InterfaceFigure {

    //OBTENÇÃO DOS DADOS BÁSICOS DA FIGURA, CALCULAR E VER AREA
    void calcularArea();
    double getArea();

    //FIGURA QUADRADO
    void setSize(double size);
    double getSize();

    //FIGURA RETANGULO
    void setHeight(double height);
    void setBase(double base);
    double getHeight();
    double getBase();

    //FIGURA CIRCULO
    void setRadius(double radius);
    double getRadius();

}
