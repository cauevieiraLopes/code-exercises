package br.com.mercado.service;

import br.com.mercado.model.Produto; //importar modelo para adição do produto

import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.math.BigDecimal;

public class Servicos {

    Scanner sc = new Scanner(System.in); //Scanner para ler valores
    Map<String, Produto> carrinho = new HashMap<>(); //Carrinho do cliente
    Map<String, Produto> produtosDaLoja = new HashMap<>(); // Produtos da loja


    /*
        MENU DE ESCOLHA DO USUÁRIO
        CLIENTE: REALIZA A COMPRA E GERENCIA O CARRINHO
        FUNCIONÁRIO: ADICIONA E REMOVE OS PRODUTOS DA LOJA;
     */


    public void escolhaUsuario () {
        int opcaoUsuario = 0;

        System.out.println("===========================");
        System.out.println("           Login           ");
        System.out.println("===========================");
        System.out.println("1. Cliente");
        System.out.println("2. Funcionário");
        System.out.println("===========================");
        System.out.print("Opção: ");
        opcaoUsuario = sc.nextInt();

        if (opcaoUsuario > 2 || opcaoUsuario < 1) {
            throw new RuntimeException("Login inválido!");
        } else if (opcaoUsuario == 1) {
            menu(); //Cliente
        } else {
            menuFuncionario(); //Funcionário
        }
    }


    /*
        MENU DO FUNCIONÁRIO
     */


    public void menuFuncionario () {
        int escolha;

        do{
            System.out.println("===========================");
            System.out.println("         LOJA MENU         ");
            System.out.println("===========================");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Alterar dados do produto (preço)");
            System.out.println("4. Sair");
            System.out.println("===========================");
            System.out.print("Opção: ");
            escolha = sc.nextInt();
        }while (escolha > 4 || escolha < 1);

        switch (escolha) {
            case 1:
                adicionarProdutoLoja();
                break;
            case 2:
                removerProdutoLoja();
                break;
            case 3:
                alterarDados();
                break;
            case 4:
                escolhaUsuario();
            break;
        }
    }


    /*
        ADIÇÃO DE PRODUTOS NA LOJA
     */


    public void adicionarProdutoLoja () {
        String nome;
        double preco = 0;

        System.out.print("\nNome do produto: ");
        sc.nextLine();
        nome = sc.nextLine().trim().toUpperCase();

        //verificar se o produto já existe
        if (produtosDaLoja.containsKey(nome)) {
            throw new RuntimeException("""
                
                ======= Mensagem de erro funcionário =======
                O produto já existe
                ============================================
                """
            );
        }

        //Garantir valores positivos
        do {
            System.out.print("Preço: R$");
            preco = sc.nextDouble();
        }while (preco <= 0);

        Produto produtoNovo = new Produto();
        produtoNovo.setPreco(preco);
        produtoNovo.setQuantidade(0);

        produtosDaLoja.put(nome, produtoNovo);

        menuFuncionario();
    }


    /*
        REMOVER PRODUTO DA LOJA
     */


    public void removerProdutoLoja () {
        if (produtosDaLoja.isEmpty()) {
            throw new RuntimeException("""
                        
                        ======= Mensagem de erro funcionário =======
                        A loja não possui produtos
                        ============================================
                        """
            );
        }

        String nomeProduto;

        System.out.println("Digite o nome do produto que deseja remover (igual)");
        System.out.print("Produto: ");
        sc.nextLine();
        nomeProduto = sc.nextLine().toUpperCase().trim();

        if (produtosDaLoja.containsKey(nomeProduto)) {
            System.out.println(nomeProduto + " - Removido com sucesso!");

            produtosDaLoja.remove(nomeProduto.trim());
        } else {
            throw new RuntimeException("""
                        
                        ======= Mensagem de erro funcionário =======
                        Produto não encontrado
                        ============================================
                        """
            );
        }

        menuFuncionario();
    }


    /*
        ALTERAR DADOS DO PRODUTO
     */


    public void alterarDados () {
        if (produtosDaLoja.isEmpty()) {
            throw new RuntimeException("""
                        
                        ======= Mensagem de erro funcionário =======
                        A loja não possui produtos
                        ============================================
                        """
            );
        }

        String nome;

        System.out.println("\n===========================");
        System.out.println("         LOJA MENU         ");
        System.out.println("===========================");
        System.out.println("Digite o nome do produto que deseja alterar o preço");
        System.out.print("Produto: ");
        sc.nextLine();
        nome = sc.nextLine().trim().toUpperCase();

        if (produtosDaLoja.containsKey(nome)) {
            System.out.println("Digite o novo preço!");
            System.out.print("R$");
            double preco = sc.nextDouble();

            produtosDaLoja.get(nome).setPreco(preco);

            System.out.println("Preço alterado com sucesso!");

            menuFuncionario();
        } else {
            throw new RuntimeException("""
                        
                        ======= Mensagem de erro funcionário =======
                        Produto não localizado
                        ============================================
                        """
            );
        }
    }


    /*
       MENU DO CLIENTE
     */


    public void menu() {
        int opcao;

        do {
            System.out.println("===========================");
            System.out.println("          MERCADO          ");
            System.out.println("===========================");
            System.out.println("1. Realizar compra");
            System.out.println("2. Remover Produto");
            System.out.println("3. Exibir carrinho");
            System.out.println("4. Finalizar compra");
            System.out.println("5. Sair");

            opcao = sc.nextInt();
        }while (opcao > 5 || opcao < 1);


        switch (opcao) {
            case 1:
                realizarCompra();
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
            case 5:
                escolhaUsuario();
            default:
                throw new RuntimeException("""
                        
                        ============= Mensagem de erro =============
                        Selecione uma opção válida do menu!
                        ============================================
                        """
                );
        }
    }


    /*
        ESCOLHER PRODUTO PARA ADICIONAR AO CARRINHO
     */


    public void realizarCompra() {
        if (produtosDaLoja.isEmpty()) {
            throw new RuntimeException("""
                    
                    ============= Mensagem de erro =============
                    A loja não possui nenhuma mercadoria no momento
                    ============================================
                    """
            );
        }

        int mercadoria;
        String nome;

        System.out.println("===========================");
        System.out.println("          MERCADO          ");
        System.out.println("===========================");

        for (Map.Entry<String, Produto> item : produtosDaLoja.entrySet()) {
            nome = item.getKey();
            Produto produto = item.getValue();

            System.out.println(nome + " - Preço R$" + produto.getPreco());
        }

        System.out.println("===========================");
        System.out.println("Digite o nome do produto que deseja comprar");
        System.out.print("Produto: ");
        sc.nextLine();
        nome = sc.nextLine().trim().toUpperCase();

        if (produtosDaLoja.containsKey(nome)) {
            int quantidade = 0;

            do {
                System.out.println("Qual a quantidade desejada?");
                System.out.print("Quantidade: ");
                quantidade = sc.nextInt();
            }while (quantidade <= 0);

            Produto produtoAtual = new Produto();

            produtoAtual.setPreco(produtosDaLoja.get(nome).getPreco());
            produtoAtual.setQuantidade(quantidade);

            carrinho.put(nome, produtoAtual);

            System.out.println("Compra feita!");
        } else {
            throw new RuntimeException("""
                    
                    ============= Mensagem de erro =============
                    Produto não localizado
                    ============================================
                    """
            );
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

        int quantidade = 0;

        System.out.println("===========================");
        System.out.println("     Produtos Atuais");
        System.out.println("===========================");

        //exibir todos os itens do carrinho
        for (Map.Entry<String, Produto> itens : carrinho.entrySet()) {
            String nome = itens.getKey();
            Produto produto = itens.getValue();

            double precoProduto = produto.getQuantidade() * (produto.getPreco() * 100) / 100;

            BigDecimal pp = new BigDecimal(precoProduto);
            pp = pp.setScale(2, RoundingMode.HALF_UP);

            System.out.println(nome + " -  Quantidade x" + produto.getQuantidade() + " - preço R$ " + pp);
        }

        //receber a solicitação
        System.out.println("===========================");
        System.out.println("Digite o nome do produto que deseja remover!");
        System.out.print("Produto: ");
        sc.nextLine();
        String produtoParaRemover = sc.nextLine().trim().toUpperCase();

        if (carrinho.containsKey(produtoParaRemover)) {
            do{
                System.out.println("Qual quantidade deseja remover?");
                quantidade = sc.nextInt();
            }while(quantidade < 0 || quantidade > carrinho.get(produtoParaRemover).getQuantidade());

            if (quantidade == carrinho.get(produtoParaRemover).getQuantidade()) {
                carrinho.remove(produtoParaRemover);
                System.out.println("produto removido do carrinho!");

            } else if (quantidade == 0) {
                System.out.println("Nenhum item foi removido!");
            } else {
                carrinho.get(produtoParaRemover).setQuantidade(carrinho.get(produtoParaRemover).getQuantidade() - quantidade);
                System.out.println(quantidade + " itens foram removidos");
            }


        } else {
            throw new RuntimeException("""
                    
                    ============= Mensagem de erro =============
                    Produto não localizado
                    ============================================
                    """
            );
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

            double precoProduto = produto.getQuantidade() * (produto.getPreco() * 100) / 100;

            BigDecimal pp = new BigDecimal(precoProduto);
            pp = pp.setScale(2, RoundingMode.HALF_UP);

            System.out.println(nome + " - Quantidade x" + produto.getQuantidade() + " - preço R$ " + pp);
            valorAtual += (produto.getPreco() * 100) * produto.getQuantidade() / 100;
        }
        BigDecimal va = new BigDecimal(valorAtual);
        va = va.setScale(2, RoundingMode.HALF_UP);

        System.out.println("===========================");
        System.out.println("Preço atual R$ " + va + "\n");

        menu();
    }


    /*
        Finalização da compra/sistema
     */


    public void finalizarCompra() {
        if (carrinho.isEmpty()) {
            throw new RuntimeException("Sistema encerrado");
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

            double precoProduto = produto.getQuantidade() * (produto.getPreco() * 100) / 100;

            BigDecimal pp = new BigDecimal(precoProduto);
            pp = pp.setScale(2, RoundingMode.HALF_UP);

            System.out.println(nome + " -  Quantidade x" + produto.getQuantidade() + " - preço R$ " + pp);

            valorFinal += (produto.getPreco() * 100) * produto.getQuantidade() / 100;
        }

        BigDecimal vf = new BigDecimal(valorFinal);

        vf = vf.setScale(2, RoundingMode.HALF_UP);

        System.out.println("===========================");
        System.out.println("Valor total R$" + vf);

        throw new RuntimeException("Sistema encerrado");
    }
}