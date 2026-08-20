# 🛒 Sistema de Gestão de Mercado e Carrinho em Java

Aplicação de terminal desenvolvida em Java aplicando conceitos de **Programação Orientada a Objetos (POO)**, **Coleções (`HashMap`)** e manipulação de **Data/Hora (`java.time`)**. O sistema simula um fluxo completo de compras em um mercado, permitindo adicionar itens, remover quantidades, visualizar o carrinho dinâmico e emitir nota fiscal.

---

## 🛠️ Tecnologias e Conceitos Aplicados

- **Arquitetura em Camadas:** Organização clara de responsabilidades nos pacotes `controller`, `model` e `service`.
- **Coleções com `HashMap`:** Armazenamento do carrinho no formato Chave-Valor (`Map<String, Produto>`), permitindo busca rápida com `.containsKey()`.
- **Tratamento de Exceções (`RuntimeException`):** Validação de entradas do usuário para evitar estados inválidos no carrinho.
- **Auditoria Temporal (`java.time`):** Uso de `LocalDate` e `LocalTime` para carimbar o momento exato do fechamento da compra na Nota Fiscal.
- **Precisão Financeira:** Manipulação de valores monetários usando números inteiros para evitar imprecisões de arredondamento de ponto flutuante.

---

## 📋 Funcionalidades

1. **Realizar Compra:** Seleção de produtos do catálogo e adição ao carrinho especificando a quantidade.
2. **Atualização Automática:** Se o produto já existe no carrinho, o sistema soma a nova quantidade à existente.
3. **Remover Produto:** Permite decrementar a quantidade de um item específico ou removê-lo completamente do carrinho quando a quantidade chega a zero.
4. **Exibir Carrinho:** Exibição dos itens selecionados com cálculo em tempo real do valor parcial.
5. **Finalizar Compra:** Emissão de nota fiscal detalhada contendo data, horário e valor total final.

---

## 🚀 Como Executar

1. Certifique-se de ter o **JDK 17+** instalado.
2. Clone este repositório ou baixe os arquivos fonte.
3. Abra na sua IDE de preferência (IntelliJ IDEA, Eclipse, VS Code) e execute a classe `Main.java` localizada no pacote `br.com.mercado.controller`.

---

# 👤 Autor
Cauê Vieira Lopes - [Perfil no GitHub](https://github.com/cauevieiraLopes)
