package br.com.cadastro.service;

import java.time.LocalDateTime;

import br.com.cadastro.model.Produto;

public class Services {
    public void cadastrarProduto(String name, double value) {

        LocalDateTime agora = LocalDateTime.now();

        Produto pd = new Produto();
        pd.nameProduct = name;
        pd.valueProdutc = value;

        System.out.println("Produto cadastrado!");
        System.out.println(agora);
        System.out.println("nome: " + pd.nameProduct);
        System.out.println("preço: R$" + pd.valueProdutc);
    }
}
