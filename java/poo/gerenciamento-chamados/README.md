# Gerenciamento de Chamados

![Java](https://img.shields.io/badge/Java-15%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-In%20Development-yellow?style=for-the-badge)
![Paradigm](https://img.shields.io/badge/Paradigm-OOP-007396?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

![Controller](https://img.shields.io/badge/Layer-Controller-007396?style=flat-square)
![Model](https://img.shields.io/badge/Layer-Model-2E8B57?style=flat-square)
![Services](https://img.shields.io/badge/Layer-Services-9370DB?style=flat-square)
![Java Time](https://img.shields.io/badge/Java%20Time-API-ED8B00?style=flat-square)
![Collections](https://img.shields.io/badge/Collections-Framework-007396?style=flat-square)
![Scanner](https://img.shields.io/badge/Scanner-Input-6A5ACD?style=flat-square)
![JUnit](https://img.shields.io/badge/Automated%20Tests-Planned-25A162?style=flat-square&logo=junit5&logoColor=white)

## Sobre o projeto

O **Gerenciamento de Chamados** é uma aplicação desenvolvida em Java com o objetivo de simular um sistema de registro e acompanhamento de chamados.

A aplicação permite cadastrar solicitações, consultar informações por meio de identificadores únicos, visualizar todos os registros e atualizar o status dos chamados.

O projeto foi desenvolvido com foco na aplicação prática de conceitos de Programação Orientada a Objetos, organização em camadas, manipulação de coleções e tratamento de datas.

## Funcionalidades

- **Cadastro de chamados:** permite registrar novos chamados com título e descrição.
- **Identificação automática:** atribui um ID único e sequencial para cada chamado.
- **Consulta individual:** localiza um chamado específico por meio do seu ID.
- **Listagem de chamados:** apresenta todos os chamados cadastrados e suas respectivas informações.
- **Alteração de status:** permite finalizar chamados que ainda estejam abertos.
- **Registro de datas:** armazena automaticamente a data e o horário de solicitação e finalização.
- **Validação de entrada numérica:** verifica se a opção informada pelo usuário corresponde a um número inteiro.
- **Controle de status:** utiliza um tipo enumerado para representar os estados dos chamados.

## Tecnologias e conceitos

O projeto utiliza Java e recursos da biblioteca padrão para implementar as funcionalidades do sistema.

### Tecnologias

- **Java:** linguagem utilizada no desenvolvimento.
- **Java Time API:** manipulação de datas, horários e fusos.
- **Collections Framework:** armazenamento dos chamados em uma lista dinâmica.
- **Scanner:** leitura de dados informados pelo usuário no terminal.

### Conceitos aplicados

| Conceito | Aplicação |
|---|---|
| Programação Orientada a Objetos (POO) | Organização do sistema em classes com responsabilidades distintas. |
| Encapsulamento | Utilização de atributos privados e métodos de acesso na classe `Chamado`. |
| Enum | Representação dos estados possíveis de um chamado por meio de `StatusChamado`. |
| ArrayList | Armazenamento dinâmico dos chamados cadastrados. |
| Optional | Representação do resultado da busca por um chamado, evitando retornos nulos. |
| Text Blocks | Organização da apresentação do menu utilizando strings multilinha. |
| Switch Expressions | Seleção da funcionalidade correspondente à opção escolhida. |
| StringBuilder | Construção dinâmica das informações apresentadas ao usuário. |
| OffsetDateTime | Registro de datas e horários com informação de fuso. |
| DateTimeFormatter | Formatação das datas de solicitação e finalização. |
| Expressões Lambda | Implementação das ações de sucesso e ausência de resultado com `ifPresentOrElse()`. |

### Métodos e recursos importantes

| Recurso | Finalidade |
|---|---|
| `hasNextInt()` | Verifica se a próxima entrada pode ser interpretada como inteiro. |
| `nextInt()` | Obtém um número inteiro informado pelo usuário. |
| `nextLine()` | Lê uma linha completa do terminal. |
| `trim()` | Remove espaços em branco das extremidades de uma string. |
| `toLowerCase()` | Converte o texto para letras minúsculas. |
| `replaceAll()` | Substitui sequências que correspondem a uma expressão regular. |
| `ArrayList.add()` | Adiciona um chamado à lista. |
| `Optional.of()` | Cria um Optional contendo um resultado encontrado. |
| `Optional.empty()` | Representa a ausência de um resultado. |
| `ifPresentOrElse()` | Executa uma ação dependendo da existência de um resultado. |
| `OffsetDateTime.now()` | Obtém a data e o horário atuais com deslocamento de fuso. |
| `DateTimeFormatter.ofPattern()` | Define o padrão de apresentação das datas. |
| `StringBuilder.append()` | Adiciona conteúdo à construção de uma string. |

## Arquitetura do projeto

O projeto está organizado em três pacotes principais: `controller`, `model` e `services`.

Essa divisão busca separar o ponto de entrada da aplicação, a representação dos dados e as operações relacionadas ao gerenciamento dos chamados.

```text
src/
└── br/
    └── com/
        └── gerenciamentochamados/
            ├── controller/
            │   └── Main.java
            │
            ├── model/
            │   ├── Chamado.java
            │   └── StatusChamado.java
            │
            └── services/
                └── ServiceChamado.java
```

### Main.java

Responsável por iniciar a aplicação, apresentar o menu principal e direcionar as opções selecionadas pelo usuário para os métodos da camada de serviço.

### Chamado.java

Representa a entidade principal do sistema. Armazena o identificador, título, descrição, status, data de solicitação e data de finalização de cada chamado.

### StatusChamado.java

Enum responsável por definir os estados disponíveis para um chamado:

- `ABERTO`: estado inicial de um chamado recém-cadastrado.
- `FINALIZADO`: estado atribuído após a conclusão do chamado.

### ServiceChamado.java

Concentra as operações do sistema, incluindo cadastro, consulta, listagem, alteração de status e validação de entradas.

Também mantém a lista de chamados e controla a geração dos identificadores.

## Pré-requisitos

Para executar o projeto, você precisará de:

- **JDK 15 ou superior:** necessário devido à utilização de Text Blocks e outros recursos da linguagem.
- Terminal ou IDE com suporte a Java.
- Git, caso deseje clonar o repositório.

## Instalação e execução

### 1. Clone o repositório

Substitua `SEU_USUARIO` e `NOME_DO_REPOSITORIO` pelos dados correspondentes ao seu repositório.

```bash
git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
```

### 2. Acesse a pasta do projeto

```bash
cd NOME_DO_REPOSITORIO
```

### 3. Compile os arquivos

Considerando a estrutura de diretórios apresentada anteriormente:

```bash
javac -d out src/br/com/gerenciamentochamados/model/StatusChamado.java src/br/com/gerenciamentochamados/model/Chamado.java src/br/com/gerenciamentochamados/services/ServiceChamado.java src/br/com/gerenciamentochamados/controller/Main.java
```

### 4. Execute a aplicação

```bash
java -cp out br.com.gerenciamentochamados.controller.Main
```

> **Observação:** os comandos pressupõem que os pacotes e diretórios tenham sido renomeados para `gerenciamentochamados`, mantendo a correspondência entre as declarações `package` e a estrutura de arquivos.

## Exemplo de utilização

Ao iniciar a aplicação, o usuário encontra o menu principal:

```text
===== SISTEMA DE CHAMADOS =====
1 - Cadastrar chamado
2 - Consultar chamado
3 - Listar chamados
4 - Alterar status
0 - Sair

Opção:
```

### Cadastro de chamado

```text
===== CADASTRAR CHAMADO =====
Informe o título: erro no sistema
Informe a descrição: aplicação não está iniciando
```

### Consulta de chamado

```text
===== CONSULTAR CHAMADO =====
Digite o ID do chamado abaixo
Opção: 1

===== CHAMADO ENCONTRADO =====
ID: 1
Data de criação: 13/11/2026 09:30:00 -0300
Título: erro no sistema
Descrição: aplicação não está iniciando
Status: ABERTO
```

### Finalização de chamado

```text
Chamado encontrado e concluído!
Título: erro no sistema
Descrição: aplicação não está iniciando
Data de solicitação: 13/11/2026 09:30:00 -0300
Data de finalização: 13/11/2026 09:35:00 -0300
Status: FINALIZADO
```

*Os horários apresentados são ilustrativos. A aplicação utiliza a data e o horário do ambiente em que está sendo executada.*

## Testes e validação

O projeto pode ser validado inicialmente por meio de testes manuais no terminal.

Cenários recomendados:

- [ ] Cadastrar um chamado com título e descrição.
- [ ] Cadastrar vários chamados e verificar a geração sequencial dos IDs.
- [ ] Consultar um chamado utilizando um ID existente.
- [ ] Consultar um chamado utilizando um ID inexistente.
- [ ] Listar os chamados cadastrados.
- [ ] Tentar listar chamados com a lista vazia.
- [ ] Finalizar um chamado com status `ABERTO`.
- [ ] Tentar finalizar novamente um chamado já concluído.
- [ ] Verificar se as datas de solicitação e finalização são registradas.
- [ ] Informar letras quando o sistema solicitar um número inteiro.
- [ ] Selecionar uma opção inexistente no menu.

A implementação de testes automatizados com JUnit pode ser considerada em uma evolução futura do projeto.

## Roadmap

- [ ] Implementar edição de título e descrição dos chamados.
- [ ] Permitir reabrir chamados finalizados.
- [ ] Implementar persistência de dados utilizando banco de dados.
- [ ] Aprimorar a validação dos campos de cadastro.
- [ ] Melhorar o tratamento de entradas inválidas.
- [ ] Implementar testes automatizados com JUnit.
- [ ] Avaliar a implementação de filtros por status.
- [ ] Aprimorar a separação de responsabilidades entre as classes.

## Objetivo de aprendizagem

O desenvolvimento deste projeto proporciona a aplicação prática de conceitos fundamentais da linguagem Java, especialmente Programação Orientada a Objetos, encapsulamento, enumerações, coleções e manipulação de datas.

Além disso, permite desenvolver a capacidade de organizar aplicações em diferentes camadas, trabalhar com estruturas de dados e implementar operações de cadastro, consulta e atualização de informações.

O projeto também serve como base para futuras evoluções envolvendo persistência de dados, validação e testes automatizados.

## Licença

Este projeto está previsto para utilizar a licença [MIT](https://opensource.org/license/mit).

A licença deverá ser formalizada por meio da inclusão de um arquivo `LICENSE` na raiz do repositório.

## Autor

**Cauê Vieira Lopes** — [GitHub](https://github.com/cauevieiraLopes)
