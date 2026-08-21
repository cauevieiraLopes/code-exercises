package br.com.mercado.service;

import br.com.mercado.model.Produto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sericos {

    Scanner sc = new Scanner(System.in);
    Map<String, Produto> carrinho = new HashMap<>();

    //Menu interativo principal
    public void menu() {
        int opcao;

        System.out.println("===========================");
        System.out.println("          MERCADO          ");
        System.out.println("===========================");
        System.out.println("1. Realizar compra");
        System.out.println("2. Remover Produto");
        System.out.println("3. Exibir carrinho");
        System.out.println("4. Finalizar compra");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                listaCompra();
                break;
            case 2:
                removerCarrinho();
                break;
            case 3:
                exibirCarrinho();
                break;
            case 4:
                finalizarCompra();
                break;
            default:
                throw new RuntimeException("""
                        
                        ============= Mensagem de erro =============
                        Selecione uma opção válida do menu!
                        ============================================
                        """
                );
        }
    }

    //Escolha da mercadoria para validação no carrinho
    public void listaCompra() {
        int mercadoria;

        System.out.println("===========================");
        System.out.println("          MERCADO          ");
        System.out.println("===========================");
        System.out.println("1. Feijão\t- R$ 9.30");
        System.out.println("2. Arroz\t- R$ 15.40");
        System.out.println("3. Carne\t- R$ 28.80");
        System.out.println("4. Leite\t- R$ 12.50");
        System.out.println("5. Frango\t- R$ 25.30");

        mercadoria = sc.nextInt();

        switch (mercadoria) {
            case 1, 2, 3, 4, 5:
                adicionarProduto(mercadoria);
                break;
            default:
                listaCompra();
        }
    }

    //Adicionar produto no carrinho
    public void adicionarProduto(int mercadoria) {
        int quantidade;

        double preco = 0;
        String nome = "";

        if(mercadoria == 1) {
            preco = 930;
            nome = "Feijão";
        } else if (mercadoria == 2) {
            preco = 1540;
            nome = "Arroz";
        } else if (mercadoria == 3) {
            preco = 2880;
            nome = "Carne";
        } else if (mercadoria == 4) {
            preco = 1250;
            nome = "Leite";
        } else if (mercadoria == 5) {
            preco = 2530;
            nome = "Frango";
        }

        do {
            System.out.println("Produto: " + nome);
            System.out.println("Preço: R$ " + preco / 100);
            System.out.print("Quantidade: ");
            quantidade = sc.nextInt();
        }while (quantidade <= 0);

        if (carrinho.containsKey(nome)) {
            carrinho.get(nome).setQuantidade(carrinho.get(nome).getQuantidade() + quantidade);
        } else {
            Produto produtoAtual = new Produto();
            produtoAtual.setPreco(preco);
            produtoAtual.setQuantidade(quantidade);

            carrinho.put(nome, produtoAtual);
        }

        menu();
    }

    /*
        Função para remover item do carrinho
     */
    public void removerCarrinho() {
        if (carrinho.isEmpty()) {
            throw new RuntimeException("""
                    
                    ============= Mensagem de erro =============
                    Você não possui nenhum item no carrinho para remover
                    ============================================
                    """
            );
        }

        System.out.println("Qual item deseja remover?");
        System.out.println("===========================");
        System.out.println("ID | Nome | Quantidade | Preço atual");
        System.out.println("===========================");

        for (Map.Entry<String, Produto> item : carrinho.entrySet()) {
            String nome = item.getKey();
            Produto produto = item.getValue();
            int num = 0;

            if (nome.equals("Feijão")) {
                num = 1;
            } else if (nome.equals("Arroz")) {
                num = 2;
            } else if (nome.equals("Carne")) {
                num = 3;
            } else if (nome.equals("Leite")) {
                num = 4;
            } else if (nome.equals("Frango")) {
                num = 5;
            }

            System.out.println(num + ". " + nome + " - Quantidade x" + produto.getQuantidade() +" - Preço R$"+ (produto.getQuantidade() * produto.getPreco()) / 100);
        }

        System.out.println("===========================");
        System.out.print("Digite o ID do item que deseja remover: ");
        int opcao = sc.nextInt();

        int quantidade;

        switch (opcao) {
            case 1:
                if (carrinho.containsKey("Feijão")) {

                    do {
                        System.out.println("Qual a quantidade que deseja remover?");
                        System.out.print("Quantidade: ");
                        quantidade = sc.nextInt();
                    } while (quantidade < 0 || quantidade > carrinho.get("Feijão").getQuantidade());

                    carrinho.get("Feijão").setQuantidade(carrinho.get("Feijão").getQuantidade() - quantidade);

                    if (quantidade == 0) {
                        System.out.println("Nenhuma unidade foi removida!");
                    } else {
                        System.out.println(quantidade + " unidades removidas com sucesso!");
                    }

                    if (carrinho.get("Feijão").getQuantidade() == 0) {
                        carrinho.remove("Feijão");
                    }

                } else {
                    throw new RuntimeException("""
                            
                            ============= Mensagem de erro =============
                            Você não possui esse item no carrinho
                            ============================================
                            """
                    );
                }

                break;
            case 2:
                if (carrinho.containsKey("Arroz")) {

                    do {
                        System.out.println("Qual a quantidade que deseja remover?");
                        System.out.print("Quantidade: ");
                        quantidade = sc.nextInt();
                    } while (quantidade < 0 || quantidade > carrinho.get("Arroz").getQuantidade());

                    carrinho.get("Arroz").setQuantidade(carrinho.get("Arroz").getQuantidade() - quantidade);

                    if (quantidade == 0) {
                        System.out.println("Nenhuma unidade foi removida!");
                    } else {
                        System.out.println(quantidade + " unidades removidas com sucesso!");
                    }

                    if (carrinho.get("Arroz").getQuantidade() == 0) {
                        carrinho.remove("Arroz");
                    }


                } else {
                    throw new RuntimeException("""
                            
                            ============= Mensagem de erro =============
                            Você não possui esse item no carrinho
                            ============================================
                            """
                    );
                }
                break;
            case 3:
                if (carrinho.containsKey("Carne")) {

                    do {
                        System.out.println("Qual a quantidade que deseja remover?");
                        System.out.print("Quantidade: ");
                        quantidade = sc.nextInt();
                    } while (quantidade < 0 || quantidade > carrinho.get("Carne").getQuantidade());

                    carrinho.get("Carne").setQuantidade(carrinho.get("Carne").getQuantidade() - quantidade);

                    if (quantidade == 0) {
                        System.out.println("Nenhuma unidade foi removida!");
                    } else {
                        System.out.println(quantidade + " unidades removidas com sucesso!");
                    }

                    if (carrinho.get("Carne").getQuantidade() == 0) {
                        carrinho.remove("Carne");
                    }


                } else {
                    throw new RuntimeException("""
                            
                            ============= Mensagem de erro =============
                            Você não possui esse item no carrinho
                            ============================================
                            """
                    );
                }
                break;
            case 4:
                if (carrinho.containsKey("Leite")) {

                    do {
                        System.out.println("Qual a quantidade que deseja remover?");
                        System.out.print("Quantidade: ");
                        quantidade = sc.nextInt();
                    } while (quantidade < 0 || quantidade > carrinho.get("Leite").getQuantidade());

                    carrinho.get("Leite").setQuantidade(carrinho.get("Leite").getQuantidade() - quantidade);

                    if (quantidade == 0) {
                        System.out.println("Nenhuma unidade foi removida!");
                    } else {
                        System.out.println(quantidade + " unidades removidas com sucesso!");
                    }

                    if (carrinho.get("Leite").getQuantidade() == 0) {
                        carrinho.remove("Leite");
                    }


                } else {
                    throw new RuntimeException("""
                            
                            ============= Mensagem de erro =============
                            Você não possui esse item no carrinho
                            ============================================
                            """
                    );
                }
                break;
            case 5:
                if (carrinho.containsKey("Frango")) {

                    do {
                        System.out.println("Qual a quantidade que deseja remover?");
                        System.out.print("Quantidade: ");
                        quantidade = sc.nextInt();
                    } while (quantidade < 0 || quantidade > carrinho.get("Frango").getQuantidade());

                    carrinho.get("Frango").setQuantidade(carrinho.get("Frango").getQuantidade() - quantidade);

                    if (quantidade == 0) {
                        System.out.println("Nenhuma unidade foi removida!");
                    } else {
                        System.out.println(quantidade + " unidades removidas com sucesso!");
                    }

                    if (carrinho.get("Frango").getQuantidade() == 0) {
                        carrinho.remove("Frango");
                    }


                } else {
                    throw new RuntimeException("""
                            
                            ============= Mensagem de erro =============
                            Você não possui esse item no carrinho
                            ============================================
                            """
                    );
                }
                break;
            default:
                removerCarrinho();
                break;
        }
        menu();
    }

    /*
        Função para exibir os itens do carrinho
     */
    public void exibirCarrinho() {
        if (carrinho.isEmpty()) {
            throw new RuntimeException("""
                    
                    ============= Mensagem de erro =============
                    Você não adicionou nenhum item no carrinho!
                    ============================================
                    """
            );
        }

        double valorAtual = 0;

        System.out.println("===========================");
        System.out.println("      Lista de compras     ");
        System.out.println("===========================");

        for(Map.Entry<String, Produto> item : carrinho.entrySet()) {
            String nome = item.getKey();
            Produto produto = item.getValue();

            System.out.println(nome + " -  Quantidade x" + produto.getQuantidade() + " - preço R$ " + (produto.getQuantidade() * produto.getPreco()) / 100);

            valorAtual += produto.getPreco() * produto.getQuantidade();
        }

        System.out.println("===========================");
        System.out.println("Preço atual R$ " + valorAtual / 100);
        System.out.println("===========================\n");
        menu();
    }

    /*
        Finalização da compra/sistema
     */

    public void finalizarCompra() {
        if (carrinho.isEmpty()) {
            System.out.println("Sistema finalizado!");
            return;
        }

        double valorFinal = 0;

        System.out.println("===========================");
        System.out.println("         NOTA FISCAL       ");
        System.out.println("===========================");
        System.out.println("Compra efetuada no dia: " + LocalDate.now());
        System.out.println("No horário: " + LocalTime.now());
        System.out.println("===========================");

        for(Map.Entry <String, Produto> item : carrinho.entrySet()) {
            String nome = item.getKey();
            Produto produto = item.getValue();

            System.out.println(nome + " -  Quantidade x" + produto.getQuantidade() + " - preço R$ " + (produto.getQuantidade() * produto.getPreco()) / 100);


            valorFinal += produto.getPreco() * produto.getQuantidade();
        }

        System.out.println("===========================");
        System.out.println("Valor total R$" + valorFinal / 100);
    }
}