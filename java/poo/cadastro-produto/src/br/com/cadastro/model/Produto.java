package br.com.cadastro.model;

public class Produto {
    private String nameProduct;

    private double valueProdutc;


    //metodos get e set para atribuir e puxar valor da classe produto
    public void setNameProduct(String nome) {
        this.nameProduct = nome.toUpperCase();
    }

    public String getNameProduct() {
        return this.nameProduct.toUpperCase();
    }

    public void setValueProdutc(double value) {
        this.valueProdutc = value;
    }

    public double getValueProdutc() {
        return this.valueProdutc;
    }
}
