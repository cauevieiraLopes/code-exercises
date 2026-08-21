# 🛒 Sistema de Gestão de Mercado e Carrinho em Java

Aplicação de terminal desenvolvida em Java aplicando **Programação Orientada a Objetos (POO)**, **Coleções Avançadas (`HashMap`)** e manipulação de **Data/Hora (`java.time`)**. O projeto simula o fluxo completo de um caixa de mercado, permitindo adição inteligente de itens, remoção controlada e emissão de nota fiscal.

---

## 🛠️ Tecnologias e Conceitos Aplicados

- **Arquitetura em Camadas:** Divisão em `controller`, `model` e `service` para manter o código organizado e com responsabilidades bem definidas.
- **Mapeamento de Dados (`HashMap`):** Uso da estrutura `Map<String, Produto>` para busca e manipulação eficiente dos itens no carrinho.
- **Iteração Dinâmica com `Map.Entry`:** Refatoração de métodos para percorrer os pares de chave-valor (`entrySet()`), eliminando código estático e permitindo renderização dinâmica dos produtos e totais.
- **Tratamento de Exceções (`RuntimeException`):** Controle de fluxo e mensagens de erro personalizadas para validação de opções inválidas do usuário.
- **Carimbo Temporal (`java.time`):** Registro preciso da data (`LocalDate`) e do horário (`LocalTime`) no momento do fechamento e emissão da Nota Fiscal.
- **Tratamento de Valores Financeiros:** Lógica baseada em centavos inteiros para evitar imprecisões e erros de arredondamento em operações monetárias.

---

## 📋 Funcionalidades

1. **Realizar Compra:** Seleção de produtos do catálogo e adição ao carrinho com verificação automática de duplicidade (somando a quantidade caso o item já exista).
2. **Remover Produto:** Consulta visual das quantidades e preços acumulados no carrinho, permitindo decrementar itens até a remoção completa.
3. **Exibir Carrinho Dinâmico:** Listagem dos itens presentes no carrinho calculada via laço `for-each` com exibição de subtotais em tempo real.
4. **Finalizar Compra & Nota Fiscal:** Fechamento do pedido com impressão detalhada do extrato contendo data, horário exato e valor total.

---

## 🚀 Como Executar

1. Certifique-se de ter o **JDK 17+** instalado.
2. Clone este repositório ou baixe os arquivos fonte.
3. Abra em sua IDE de preferência (IntelliJ IDEA, Eclipse, VS Code) e execute a classe `Main.java` localizada no pacote `br.com.mercado.controller`.

---

# 👤 Autor
Cauê Vieira Lopes - [Perfil no GitHub](https://github.com/cauevieiraLopes)
