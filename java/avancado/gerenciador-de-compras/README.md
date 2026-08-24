# 🛒 Sistema Completo de Gestão de Mercado em Java

Aplicação de terminal desenvolvida em Java focada na simulação real de operações de um mercado. O sistema conta com **painéis dinâmicos para Cliente e Funcionário**, gestão de estoque em tempo real, manipulação avançada de coleções com `HashMap`, precisão financeira usando `BigDecimal` e um mecanismo seguro para tratamento de exceções e fluxo de controle.

---

## 🛠️ Tecnologias e Arquitetura

- **Arquitetura em Camadas:** Separação limpa entre a camada de controle (`Main.java`), modelo (`Produto.java`) e regras de negócio (`Servicos.java`).
- **Mapeamento de Dados (`HashMap`):** Uso de mapas dinâmicos para gerenciar tanto o estoque da loja (`produtosDaLoja`) quanto os itens do cliente (`carrinho`), permitindo consultas em tempo constante O(1).
- **Precisão Financeira (`BigDecimal` & `RoundingMode`):** Tratamento rigoroso do arredondamento monetário (`HALF_UP`) com duas casas decimais, prevenindo erros de arredondamento de ponto flutuante.
- **Tratamento de Exceções Avançado:** Sistema de gerenciamento de exceções desacoplado no `Main.java` utilizando `while (true)` e `try-catch`, permitindo capturar mensagens customizadas e redirecionar o usuário para a tela correta sem interromper o sistema ou causar estouro de pilha (*Stack Overflow*).
- **Formatação de Texto Dinâmica:** Normalização de entradas do usuário utilizando `.trim().toUpperCase()` para padronizar nomes de produtos e ignorar espaços ou inconsistências de maiúsculas e minúsculas.
- **Carimbo Temporal (`java.time`):** Auditoria na emissão do cupom fiscal registrando a data (`LocalDate`) e o horário (`LocalTime`) exatos do encerramento da compra.

---

## 👥 Perfis de Acesso e Funcionalidades

### 👨‍💼 Módulo Funcionário (Gestão do Estoque)
1. **Adicionar Produto:** Cadastro de novos itens no estoque da loja com validação de nomes duplicados e preços positivos.
2. **Remover Produto:** Exclusão de itens do catálogo da loja via busca textual.
3. **Alterar Dados do Produto:** Atualização dinâmica de preços de produtos cadastrados no estoque.

### 🛒 Módulo Cliente (Carrinho de Compras)
1. **Realizar Compra:** Visualização do catálogo atualizado da loja em tempo real e adição de itens com quantidades customizadas ao carrinho.
2. **Remover Item do Carrinho:** Remoção parcial ou total de produtos do carrinho com ajuste automático de saldo.
3. **Exibir Carrinho:** Impressão detalhada dos itens selecionados, quantidades, subtotais calculados e valor parcial da compra.
4. **Finalizar Compra:** Fechamento do pedido com impressão de **Nota Fiscal** formatada, incluindo valor total acumulado, data e hora da transação.

---

## 💻 Como Executar

1. Certifique-se de ter o **JDK 17** (ou superior) instalado.
2. Clone o repositório ou baixe os arquivos do código-fonte.
3. Abra o projeto na sua IDE Java preferida (IntelliJ IDEA, Eclipse, VS Code).
4. Execute o arquivo `Main.java` localizado no pacote `br.com.mercado.controller`.

---

## 👤 Autor

**Cauê Vieira Lopes**  
- GitHub: [@cauevieiraLopes](https://github.com/cauevieiraLopes)
