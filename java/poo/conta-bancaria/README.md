# Conta Bancária

## Sobre o Projeto

Projeto desenvolvido em Java como exercício prático da **DIO (Digital Innovation One)**, com o objetivo de aplicar conceitos fundamentais de programação e Programação Orientada a Objetos na construção de uma simulação de conta bancária.

A aplicação permite realizar operações como consulta de saldo, consulta de cheque especial, depósitos, saques e pagamentos de boletos, incluindo regras específicas para utilização do limite e cobrança de taxa sobre o cheque especial.

O projeto utiliza estruturas condicionais, estruturas de repetição, `switch`, métodos e classes para representar as operações de uma conta bancária.

## Funcionalidades

* Consulta do saldo da conta
* Consulta do limite de cheque especial
* Depósito de dinheiro
* Saque de dinheiro
* Pagamento de boletos
* Verificação da utilização do cheque especial
* Definição automática do limite de cheque especial de acordo com o saldo inicial
* Controle do limite original e do limite disponível
* Cobrança de taxa de 20% sobre o valor utilizado do cheque especial
* Renovação do limite após a quitação da dívida

### Regras do Cheque Especial

O limite é definido no momento da criação da conta de acordo com o saldo inicial:

| Saldo inicial      | Limite de cheque especial |
| ------------------ | ------------------------: |
| Até R$ 500,00      |                  R$ 50,00 |
| Acima de R$ 500,00 |      50% do saldo inicial |

Quando o cheque especial é utilizado, a aplicação calcula uma taxa de 20% sobre o valor utilizado.

A dívida pode ser quitada quando houver saldo suficiente, restaurando o limite original do cheque especial.

## Tecnologias Utilizadas

* Java
* Java Standard Library
* `Scanner`
* Programação Orientada a Objetos

## Estrutura do Projeto

```text
src/
└── br.com.contaBancaria/
    ├── Main.java
    ├── Conta.java
    └── Servicos.java
```

### `Main`

Responsável pela inicialização da aplicação e pelo controle do menu principal.

O menu permite selecionar as operações disponíveis e direciona cada opção para os métodos correspondentes da classe `Servicos`.

### `Conta`

Representa a conta bancária e mantém seus principais dados financeiros.

Entre suas responsabilidades estão:

* Armazenamento do saldo
* Controle do limite original do cheque especial
* Controle do limite disponível
* Depósito de valores
* Subtração do saldo
* Utilização do cheque especial
* Quitação da dívida
* Renovação do limite do cheque especial

### `Servicos`

Responsável pela interação da aplicação com o usuário através do terminal.

Entre suas responsabilidades estão:

* Criação da conta
* Leitura dos valores informados pelo usuário
* Consulta do saldo
* Consulta do cheque especial
* Depósito
* Saque
* Pagamento de boletos
* Verificação da utilização do cheque especial
* Aplicação das regras necessárias para as operações

## Como Executar

### Pré-requisitos

* Java JDK instalado
* IDE compatível com Java ou terminal configurado para execução de aplicações Java

### Execução

Clone o repositório e abra o projeto em sua IDE de preferência.

Execute a classe:

```text
Main.java
```

Informe o saldo inicial solicitado pela aplicação e utilize o menu exibido no terminal para realizar as operações disponíveis.

## Conceitos Aplicados

O projeto utiliza conceitos fundamentais de Java e Programação Orientada a Objetos, incluindo:

* Classes e objetos
* Encapsulamento
* Atributos privados
* Construtores
* Métodos de acesso
* Estruturas condicionais
* Estruturas de repetição
* `switch`
* Operador ternário
* Entrada de dados com `Scanner`
* Separação básica de responsabilidades
* Manipulação do estado de objetos
* Controle de regras de negócio

## Melhorias Futuras

* Centralizar as regras financeiras na classe `Conta`
* Simplificar o fluxo das operações de saque e pagamento
* Evitar métodos que alterem diretamente o saldo sem representar claramente uma operação de negócio
* Separar melhor as responsabilidades entre interação com o usuário e regras de negócio
* Melhorar o tratamento de entradas inválidas
* Utilizar `BigDecimal` para representar valores monetários em uma implementação mais próxima de um sistema financeiro real
* Adicionar testes automatizados para validar depósitos, saques, pagamentos, uso do cheque especial e quitação de dívidas

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
