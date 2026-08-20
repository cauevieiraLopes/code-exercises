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

        switch (mercadoria) {
            case 1: //Adicionar o feijão
                System.out.println("Produto: Feijão");
                System.out.println("Preço R$ 09.30");
                System.out.print("Quantidade: ");
                quantidade = sc.nextInt();

                if (quantidade <= 0) {
                    adicionarProduto(mercadoria);
                } else {

                    if (carrinho.containsKey("Feijão")) {
                        carrinho.get("Feijão").setQuantidade(carrinho.get("Feijão").getQuantidade() + quantidade);
                    } else {
                        Produto produtoAtual = new Produto();
                        produtoAtual.setPreco(930);
                        produtoAtual.setQuantidade(quantidade);

                        carrinho.put("Feijão", produtoAtual);
                    }
                }

                break;
            case 2: //Adicionar o arroz
                System.out.println("Produto: Arroz");
                System.out.println("Preço R$ 15.40");
                System.out.print("Quantidade: ");
                quantidade = sc.nextInt();

                if (quantidade <= 0) {
                    adicionarProduto(mercadoria);
                } else {

                    if (carrinho.containsKey("Arroz")) {
                        carrinho.get("Arroz").setQuantidade(carrinho.get("Arroz").getQuantidade() + quantidade);
                    } else {
                        Produto produtoAtual = new Produto();
                        produtoAtual.setPreco(1540);
                        produtoAtual.setQuantidade(quantidade);

                        carrinho.put("Arroz", produtoAtual);
                    }
                }

                break;
            case 3: //Adicionar o carne
                System.out.println("Produto: Carne");
                System.out.println("Preço R$ 28.80");
                System.out.print("Quantidade: ");
                quantidade = sc.nextInt();

                if (quantidade <= 0) {
                    adicionarProduto(mercadoria);
                } else {

                    if (carrinho.containsKey("Carne")) {
                        carrinho.get("Carne").setQuantidade(carrinho.get("Carne").getQuantidade() + quantidade);
                    } else {
                        Produto produtoAtual = new Produto();
                        produtoAtual.setPreco(2880);
                        produtoAtual.setQuantidade(quantidade);

                        carrinho.put("Carne", produtoAtual);
                    }
                }

                break;

            case 4: //Adicionar o Leite
                System.out.println("Produto: Leite");
                System.out.println("Preço R$ 12.50");
                System.out.print("Quantidade: ");
                quantidade = sc.nextInt();

                if (quantidade <= 0) {
                    adicionarProduto(mercadoria);
                } else {

                    if (carrinho.containsKey("Leite")) {
                        carrinho.get("Leite").setQuantidade(carrinho.get("Leite").getQuantidade() + quantidade);
                    } else {
                        Produto produtoAtual = new Produto();
                        produtoAtual.setPreco(1250);
                        produtoAtual.setQuantidade(quantidade);

                        carrinho.put("Leite", produtoAtual);
                    }
                }

                break;
            case 5: //Adicionar o Frango
                System.out.println("Produto: Frango");
                System.out.println("Preço R$ 25.30");
                System.out.print("Quantidade: ");
                quantidade = sc.nextInt();

                if (quantidade <= 0) {
                    adicionarProduto(mercadoria);
                } else {

                    if (carrinho.containsKey("Frango")) {
                        carrinho.get("Frango").setQuantidade(carrinho.get("Frango").getQuantidade() + quantidade);
                    } else {
                        Produto produtoAtual = new Produto();
                        produtoAtual.setPreco(2530);
                        produtoAtual.setQuantidade(quantidade);

                        carrinho.put("Frango", produtoAtual);
                    }
                }

                break;
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
        if (carrinho.containsKey("Feijão")) {
            System.out.println("1. Feijão x" + carrinho.get("Feijão").getQuantidade());
        } else {
            System.out.println("1. Feijão x0");
        }
        if (carrinho.containsKey("Arroz")) {
            System.out.println("2. Arroz x" + carrinho.get("Arroz").getQuantidade());
        } else {
            System.out.println("2. Arroz x0");
        }
        if (carrinho.containsKey("Carne")) {
            System.out.println("3. Carne x" + carrinho.get("Carne").getQuantidade());
        } else {
            System.out.println("3. Carne x0");
        }
        if (carrinho.containsKey("Leite")) {
            System.out.println("4. Leite x" + carrinho.get("Leite").getQuantidade());
        } else {
            System.out.println("4. Leite x0");
        }
        if (carrinho.containsKey("Frango")) {
            System.out.println("5. Frango x" + carrinho.get("Frango").getQuantidade());
        } else {
            System.out.println("5. Frango x0");
        }

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

        if (carrinho.containsKey("Feijão")) {
            System.out.println("Feijão\t- Quantidade: " + carrinho.get("Feijão").getQuantidade());
            valorAtual += (carrinho.get("Feijão").getQuantidade() * carrinho.get("Feijão").getPreco());
        }
        if (carrinho.containsKey("Arroz")) {
            System.out.println("Arroz\t- Quantidade: " + carrinho.get("Arroz").getQuantidade());
            valorAtual += (carrinho.get("Arroz").getQuantidade() * carrinho.get("Arroz").getPreco());
        }
        if (carrinho.containsKey("Carne")) {
            System.out.println("Carne\t- Quantidade: " + carrinho.get("Carne").getQuantidade());
            valorAtual += (carrinho.get("Carne").getQuantidade() * carrinho.get("Carne").getPreco());
        }
        if (carrinho.containsKey("Leite")) {
            System.out.println("Leite\t- Quantidade: " + carrinho.get("Leite").getQuantidade());
            valorAtual += (carrinho.get("Leite").getQuantidade() * carrinho.get("Leite").getPreco());
        }
        if (carrinho.containsKey("Frango")) {
            System.out.println("Frango\t- Quantidade: " + carrinho.get("Frango").getQuantidade());
            valorAtual += (carrinho.get("Frango").getQuantidade() * carrinho.get("Frango").getPreco());
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
        if (carrinho.containsKey("Feijão")) {
            System.out.println("Feijão\t- Quantidade: " + carrinho.get("Feijão").getQuantidade());
            valorFinal += (carrinho.get("Feijão").getQuantidade() * carrinho.get("Feijão").getPreco());
        }
        if (carrinho.containsKey("Arroz")) {
            System.out.println("Arroz\t- Quantidade: " + carrinho.get("Arroz").getQuantidade());
            valorFinal += (carrinho.get("Arroz").getQuantidade() * carrinho.get("Arroz").getPreco());
        }
        if (carrinho.containsKey("Carne")) {
            System.out.println("Carne\t- Quantidade: " + carrinho.get("Carne").getQuantidade());
            valorFinal += (carrinho.get("Carne").getQuantidade() * carrinho.get("Carne").getPreco());
        }
        if (carrinho.containsKey("Leite")) {
            System.out.println("Leite\t- Quantidade: " + carrinho.get("Leite").getQuantidade());
            valorFinal += (carrinho.get("Leite").getQuantidade() * carrinho.get("Leite").getPreco());
        }
        if (carrinho.containsKey("Frango")) {
            System.out.println("Frango\t- Quantidade: " + carrinho.get("Frango").getQuantidade());
            valorFinal += (carrinho.get("Frango").getQuantidade() * carrinho.get("Frango").getPreco());
        }

        System.out.println("===========================");
        System.out.println("Valor total R$" + valorFinal / 100);
    }
}