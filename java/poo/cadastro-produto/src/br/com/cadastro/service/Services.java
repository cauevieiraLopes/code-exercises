package br.com.cadastro.service;

import java.time.LocalDateTime;

import br.com.cadastro.model.Produto;

public class Services {
    public void exibirProduto(Produto pd) {

        //Criação da classe para receber a hora do cadastro
        LocalDateTime agora = LocalDateTime.now();

        //Exibição das informações
        System.out.println("Produto cadastrado!");
        System.out.println(agora);
        System.out.println("nome: " + pd.getNameProduct());
        System.out.println("preço: R$" + pd.getValueProdutc());
    }
}
