# 📦 Sistema de Cadastro de Produtos v2.0 (Refatorado em POO)

Este repositório registra a evolução e refatoração do meu primeiro código em **Programação Orientada a Objetos (POO)** em Java. O projeto simula o cadastro e exibição de um produto utilizando os pilares de Encapsulamento e separação em camadas.

---

## 🔄 O que mudou nesta Refatoração (v2.0)?

- **Encapsulamento Aplicado:** Os atributos da classe `Produto` foram alterados para `private`.
- **Implementação de Getters e Setters:** Controle total sobre a leitura e escrita dos dados do produto.
- **Tratamento de Dados no Encapsulamento:** Aplicação automática de caixa alta (`.toUpperCase()`) ao atribuir o nome do produto.
- **Passagem de Objetos por Parâmetro:** O serviço de exibição (`Services`) passou a receber o objeto completo `Produto` em vez de tipos primitivos isolados.
- **Ajuste de Nomenclaturas:** Adequação das classes para o padrão `PascalCase` (`Produto` e `Services`).

---

## 🛠️ Estrutura do Projeto

```text
src/
└── br/com/cadastro/
    ├── controller/
    │   └── Main.java       → Ponto de entrada, leitura de dados e orquestração.
    ├── model/
    │   └── Produto.java    → Entidade com atributos privados, getters e setters.
    └── service/
        └── Services.java   → Regra de negócio para formatação e exibição do produto.
```
---

## 🚀 Como Executar

1. Certifique-se de ter o Java JDK instalado.
2. Navegue até a pasta `src` do projeto no terminal.
3. Compile e execute os arquivos do projeto:

```bash
# Compilar todas as camadas
javac br/com/cadastro/model/Produto.java br/com/cadastro/service/ProdutoService.java br/com/cadastro/controller/Main.java

# Executar a aplicação
java br.com.cadastro.controller.Main
```
# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
