# Task List — Gerenciador de Tarefas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/Paradigma-POO-007396?style=for-the-badge)
![DateTime](https://img.shields.io/badge/Java-Time%20API-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![StringBuilder](https://img.shields.io/badge/Java-StringBuilder-6A5ACD?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## Sobre o projeto

O **Task List** é uma aplicação de gerenciamento de tarefas desenvolvida em Java, executada por meio de uma interface interativa no terminal.

O projeto permite cadastrar tarefas, consultar a lista de atividades e registrar suas conclusões. Nesta versão refatorada, foram incorporados recursos para registrar a data e o horário de criação e conclusão das tarefas, utilizando a API de data e hora do Java.

O desenvolvimento também tem como objetivo aprofundar conhecimentos em manipulação de strings, formatação de datas, organização de classes e aplicação de conceitos de Programação Orientada a Objetos.

## Funcionalidades

- **Cadastro de tarefas:** permite adicionar novas atividades à lista.
- **Listagem de tarefas:** apresenta as atividades cadastradas e seus respectivos estados de conclusão.
- **Conclusão de tarefas:** permite selecionar uma atividade pelo índice e marcar seu status como concluído.
- **Registro de criação:** associa a data e o horário de criação à descrição da tarefa.
- **Registro de conclusão:** armazena a data e o horário em que uma tarefa é marcada como concluída.
- **Formatação de datas:** apresenta informações temporais em um formato legível.
- **Menu interativo:** disponibiliza as operações por meio de opções numéricas no terminal.

## Tecnologias e conceitos utilizados

### Tecnologias

- **Java:** linguagem utilizada no desenvolvimento da aplicação.
- **Java Time API:** recursos para obtenção e formatação de datas e horários.
- **`StringBuilder`:** construção de strings por meio de operações encadeadas.
- **`Scanner`:** leitura das entradas fornecidas pelo usuário.
- **Collections Framework:** utilização de `List` e `ArrayList` para armazenar as tarefas.

### Conceitos de programação

- **Programação Orientada a Objetos (POO):** organização da aplicação em classes com responsabilidades distintas.
- **Encapsulamento:** utilização de atributos privados e métodos de acesso na classe `ModelTask`.
- **Separação de responsabilidades:** divisão do código em camadas de controle, modelo e serviço.
- **Estruturas de controle:** utilização de `switch`, `if`, `while` e estruturas de repetição.
- **Manipulação de strings:** construção e formatação de descrições textuais.
- **Manipulação de datas e horários:** registro de instantes com informações de fuso horário.
- **Collections:** armazenamento e recuperação de tarefas por meio de uma lista.

### Classes e métodos estudados

| Classe ou método | Finalidade |
|---|---|
| `StringBuilder` | Permite construir e modificar sequências de caracteres de forma eficiente. |
| `append()` | Adiciona conteúdo ao final de um `StringBuilder`. |
| `toString()` | Converte o conteúdo de um `StringBuilder` em uma `String`. |
| `OffsetDateTime.now()` | Obtém a data e a hora atuais com o deslocamento UTC do ambiente. |
| `DateTimeFormatter.ofPattern()` | Cria um formatador de data e hora baseado em um padrão. |
| `format()` | Formata uma data e hora de acordo com um formatador. |
| `ArrayList` | Implementa uma lista dinâmica para armazenar as tarefas. |
| `add()` | Adiciona uma tarefa à lista. |
| `get()` | Recupera uma tarefa a partir de seu índice. |
| `setStatus()` | Atualiza o estado de conclusão de uma tarefa. |

## Arquitetura do projeto

O projeto está organizado em três pacotes principais:

```text
src/
└── br/
    └── com/
        └── taskList/
            ├── controller/
            │   └── Main.java
            ├── model/
            │   └── ModelTask.java
            └── service/
                └── ServiceTask.java
```

### `Main.java`

**Camada:** Controller

Responsável por iniciar a aplicação e delegar o fluxo de interação à classe `ServiceTask`.

### `ModelTask.java`

**Camada:** Model

Representa uma tarefa e mantém os seguintes atributos:

- `task`: descrição da tarefa, incluindo a data e o horário de criação na implementação atual.
- `status`: indica se a tarefa foi concluída.
- `completionDay`: armazena a data e o horário de conclusão.

A classe disponibiliza métodos para consultar a descrição, verificar o status e registrar a conclusão.

### `ServiceTask.java`

**Camada:** Service

Concentra a lógica de funcionamento da aplicação, incluindo:

- Exibição e navegação pelo menu.
- Cadastro de tarefas.
- Consulta da lista de atividades.
- Seleção e conclusão de tarefas.
- Registro e formatação de datas e horários.

## Pré-requisitos

- Java Development Kit (JDK) 14 ou superior, devido à utilização da sintaxe moderna de `switch`.
- Terminal ou IDE com suporte a Java.
- Git, caso deseje clonar o repositório.

## Instalação e execução

### 1. Clone o repositório

Substitua `SEU_USUARIO` e `NOME_DO_REPOSITORIO` pelos dados do seu repositório.

```bash
git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
```

### 2. Acesse a pasta do projeto

```bash
cd NOME_DO_REPOSITORIO
```

### 3. Compile os arquivos

Considerando que os arquivos estejam organizados dentro de `src/`, conforme a estrutura apresentada:

```bash
javac -d out src/br/com/taskList/model/ModelTask.java src/br/com/taskList/service/ServiceTask.java src/br/com/taskList/controller/Main.java
```

### 4. Execute a aplicação

```bash
java -cp out br.com.taskList.controller.Main
```

**Observação:** os comandos pressupõem que os nomes dos diretórios correspondam aos pacotes declarados nos arquivos Java.

## Exemplo de utilização

Ao iniciar a aplicação, o usuário encontra o seguinte menu:

```text
Escolha uma opção abaixo
1. Adicionar Tarefa
2. Ver Lista de Tarefa
3. Concluir Tarefa
4. Sair
-------------------------
Opção:
```

Ao selecionar a opção de cadastro, o programa solicita a descrição da atividade.

A implementação atual utiliza `StringBuilder` para construir uma descrição que inclui a data e o horário de criação.

Exemplo ilustrativo do formato produzido:

```text
[Tarefa: Estudar Java | Criada: 22/10/2026 10:30:00 -03:00]
```

O horário acima é apenas ilustrativo; o programa obtém a data e a hora durante a execução.

Quando uma tarefa é concluída, a aplicação registra seu status e armazena a data e o horário da conclusão para exibição na listagem.

## Testes e validação

Os seguintes cenários podem ser utilizados para verificar o comportamento da aplicação:

- [x] Cadastrar uma tarefa e verificar se ela aparece na listagem.
- [x] Cadastrar várias tarefas e conferir a ordem de exibição.
- [x] Verificar se a data e o horário de criação são registrados.
- [x] Concluir uma tarefa utilizando seu índice.
- [x] Verificar se o status da tarefa é atualizado corretamente.
- [x] Conferir se a data de conclusão aparece após a conclusão da tarefa.
- [x] Tentar concluir uma tarefa quando a lista está vazia.
- [x] Informar um índice inexistente durante a seleção de uma tarefa.
- [x] Informar uma opção inválida no menu.
- [x] Verificar o comportamento do programa quando uma entrada numérica recebe texto.

## Roadmap

- [x] Aprimorar a validação das entradas do usuário.
- [x] Evitar chamadas recursivas desnecessárias durante a navegação pelo menu.
- [x] Impedir o cadastro de tarefas com descrições vazias.
- [x] Exibir os índices das tarefas também na listagem geral.
- [x] Separar a descrição da tarefa dos metadados de criação.
- [x] Avaliar o armazenamento das datas como objetos temporais, em vez de strings formatadas.
- [x] Permitir a exclusão de tarefas.

## Objetivo de aprendizagem

O Task List foi desenvolvido para consolidar conhecimentos de Java por meio de uma aplicação funcional de gerenciamento de tarefas.

A refatoração permitiu explorar o uso de `StringBuilder` na construção de strings e da API `java.time` para obter e formatar datas e horários. O projeto também contribui para a prática de Programação Orientada a Objetos, manipulação de coleções, organização de código e validação de entradas.

### Observação

O menu tem dificuldades em interpretar o comando 5 "Sair" em alguns cenários, sendo necessário selecionar ele mais de uma vez para seu comando ser realizado. 

O motivo disso ocorrer ainda não foi compreendido e solucionado. Em geral, o funcionamento do código está da forma prevista e apta para uma melhoria geral futuramente!


## Licença

Este projeto está previsto para utilizar a licença MIT.

Para formalizar essa licença, adicione um arquivo `LICENSE` na raiz do repositório com o texto oficial da licença MIT, preenchido com o titular dos direitos autorais e o ano correspondente.

## Autor

**Cauê Vieira Lopes**

[![GitHub](https://img.shields.io/badge/GitHub-Perfil-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/cauevieiraLopes)
