# 📖 Analisador de Legibilidade de Texto (Python)

Este projeto consiste em um analisador de legibilidade de texto desenvolvido em Python, com foco em manipulação de strings, controle de fluxo e aplicação da fórmula de Coleman-Liau para determinar a complexidade de leitura de um texto.

## 📖 Descrição do Projeto
O programa solicita ao usuário que digite um texto qualquer, analisa a quantidade de letras, palavras e frases e calcula a série escolar (grade) necessária para a compreensão do conteúdo, categorizando os resultados entre níveis iniciais, intermediários e avançados.

## 🛠️ Recursos e Conceitos Aplicados
- **Processamento de Strings:** Uso de métodos nativos como `.split()` para contagem precisa de palavras e `.isalpha()` para filtragem de caracteres alfabéticos.
- **Estruturas Condicionais e Controle de Fluxo:** Validação da quantidade de palavras para evitar erros de divisão por zero (`ZeroDivisionError`) e direcionamento para a mensagem de saída correta.
- **Operações Matemáticas:** Implementação da fórmula de Coleman-Liau e arredondamento do resultado com a função `round()`.
- **Modularização de Código:** Divisão das responsabilidades do sistema entre funções dedicadas para leitura, validação e cálculo.

## 🚀 Como Executar
1. Certifique-se de ter o Python 3 instalado em sua máquina.
2. Clone este repositório ou navegue até a pasta do projeto.
3. Execute o arquivo via terminal:
   ```bash
   python main.py
   ```
# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
