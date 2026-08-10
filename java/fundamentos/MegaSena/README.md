# 🎰 Simulador de Mega-Sena via Argumentos de Terminal (Java)

Este projeto consiste em um simulador do jogo da Mega-Sena desenvolvido em Java. A aplicação recebe as apostas do usuário via argumentos de linha de comando, sorteia 6 números aleatórios sem repetição e calcula a quantidade de acertos obtidos.

## 📖 Descrição do Projeto
O programa captura 6 números fornecidos pelo usuário no momento da execução, realiza uma séria de validações de regras de negócio (quantidade, intervalo permitido e unicidade das apostas), gera o sorteio oficial usando geração pseudoaleatória e exibe os resultados formatados no terminal.

## 🛠️ Recursos e Conceitos Aplicados
- **Argumentos de Linha de Comando (`String[] args`):** Leitura direta dos 6 palpites do usuário.
- **Tratamento e Validação de Dados:**
  - Validação da quantidade de entradas (`args.length != 6`).
  - Verificação de intervalo dos palpites ($1 \le x \le 60$).
  - Algoritmo de busca por números duplicados nas apostas do usuário.
- **Geração de Números Aleatórios (`java.util.Random`):** Criação dos números sorteados dentro da faixa de 1 a 60.
- **Manipulação de Arrays:** Armazenamento, navegação por índices, comparação entre coleções e laços do tipo `for-each` para exibição final.

## 🚀 Como Executar

### Via Terminal
Compile o arquivo e execute passando 6 números inteiros diferentes de 1 a 60:
```bash
javac MegaSena.java
java MegaSena 4 8 15 16 23 42
```

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
