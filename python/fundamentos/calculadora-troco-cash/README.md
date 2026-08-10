# 🪙 Calculadora de Troco Mínimo em Python (`CS50 - Cash`)

Este repositório contém a resolução em Python do clássico algoritmo **Cash** (Semana 1 do curso CS50 de Harvard). O projeto implementa um **algoritmo ambicioso (Greedy Algorithm)** para calcular a quantidade mínima de moedas necessárias para fornecer um determinado valor de troco.

## 📖 Descrição do Projeto
O sistema solicita ao usuário um valor em Reais (R$), valida a entrada e calcula a distribuição ideal do troco utilizando a menor quantidade possível de moedas das seguintes denominações:
- **25 centavos**
- **10 centavos**
- **5 centavos**
- **1 centavo**

Exemplo de execução:
```text
Dinnheiro: R$0.41
Seu troco foi:
1 moedas de 25 centavos
1 moedas de 10 centavos
1 moedas de 5 centavos
1 moedas de 1 centavos
````

## 🛠️ Conceitos e Recursos Aplicados
- Algoritmo Ambicioso (Greedy Algorithm): Estratégia de resolução de problemas que faz a escolha localmente ideal em cada fase (subtrair a maior moeda possível no momento) com o objetivo de encontrar um ótimo global.

- Prevenção de Imprecisão de Ponto Flutuante: Conversão imediata dos valores em Reais para centavos inteiros através da função round(dinheiro * 100), evitando erros aritméticos característicos do cálculo com números float no computador.

- Tratamento de Erros e Exceções: Uso de blocos try/except com custom exceptions e controle de fluxo contínuo (while True) para garantir que o usuário introduza apenas valores válidos e positivos.

- Modularização de Código (Clean Code): Separação clara de responsabilidades em três funções independentes:
  1. receber_dinheiro_para_troco() (Validação e Entrada de Dados)
  
  2. contar_troco() (Lógica de Negócio e Cálculo das Moedas)
  
  3. exibir_troco() (Apresentação e Formatação dos Resultados)

## 🚀 Como Executar
1. Certifique-se de ter o Python 3 instalado.

2. Clone este repositório ou baixe o arquivo .py.

3. Execute o script no terminal:
   ```bash
    python main.py
   ````

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
