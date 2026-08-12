# 📦 Sistema de Cadastro de Produtos (Introdução à POO em Java)

Este projeto marca o meu primeiro contato prático com os conceitos de **Programação Orientada a Objetos (POO)** em Java. Desenvolvido após estudos iniciais sobre modelagem de classes, o código simula o fluxo simples de recebimento de dados via terminal e cadastro de um produto na memória.

---

## 🎯 Objetivo de Aprendizado
O objetivo principal deste exercício foi transicionar da programação estruturada/procedural para o paradigma de **Orientação a Objetos**, compreendendo a divisão do projeto em camadas/pacotes e a criação de classes para representar entidades do mundo real.

---

## 🛠️ Conceitos e Recursos Aplicados

- **Modelagem de Classes & Entidades:** Criação da classe `Produto` para representar os dados do produto (nome e preço).
- **Encapsulamento (Proteção de Dados):** Uso de atributos privados (`private`) na classe modelo, garantindo o acesso e manipulação de dados via métodos leitores e modificadores (**Getters e Setters**).
- **Separação de Responsabilidades (Pacotes):**
  - `br.com.cadastro.model`: Contém a estrutura e estado do dado (`Produto`).
  - `br.com.cadastro.service`: Contém a regra de negócio/serviço (`ProdutoService`).
  - `br.com.cadastro.controller`: Ponto de entrada da aplicação (`Main`) que gerencia a interatividade com o usuário.
- **Manipulação de Data e Hora:** Utilização do `LocalDateTime.now()` da API `java.time` para registrar o momento exato do cadastro.

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
