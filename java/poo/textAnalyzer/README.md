# Text Analyzer — Analisador de Texto

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Paradigma](https://img.shields.io/badge/Paradigma-POO-007396?style=for-the-badge)
![Strings](https://img.shields.io/badge/Manipula%C3%A7%C3%A3o-Strings-4B0082?style=for-the-badge)
![Interface](https://img.shields.io/badge/Interface-CLI-555555?style=for-the-badge)
![Git](https://img.shields.io/badge/Git-Versionamento-F05032?style=for-the-badge&logo=git&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

## Sobre o projeto

O **Text Analyzer** é uma aplicação desenvolvida em Java que permite analisar e manipular textos por meio de uma interface interativa no terminal.

O projeto tem como objetivo praticar conceitos fundamentais da linguagem Java, especialmente a manipulação de strings, o uso de estruturas de controle, a organização de classes e a interação com o usuário.

A aplicação disponibiliza ferramentas para contar caracteres e palavras, localizar termos, substituir ocorrências, extrair trechos de texto e gerar estatísticas sobre o conteúdo informado.

## Funcionalidades

![Análise de Texto](https://img.shields.io/badge/An%C3%A1lise-de%20Texto-00599C?style=flat-square)
![Busca](https://img.shields.io/badge/Busca-de%20Palavras-2E8B57?style=flat-square)
![Substituição](https://img.shields.io/badge/Substitui%C3%A7%C3%A3o-de%20Texto-9370DB?style=flat-square)
![Estatísticas](https://img.shields.io/badge/Estat%C3%ADsticas-Textuais-FF8C00?style=flat-square)

- **Contagem de caracteres:** calcula a quantidade de caracteres presentes no texto.
- **Contagem de palavras:** determina a quantidade de palavras identificadas.
- **Busca de palavras:** procura um termo e informa a posição inicial de sua primeira ocorrência.
- **Substituição de palavras:** permite substituir todas as ocorrências de um termo ou somente a primeira.
- **Extração de trechos:** permite selecionar uma parte do texto utilizando índices.
- **Separação de palavras:** exibe as palavras do texto individualmente.
- **Estatísticas completas:** apresenta informações sobre caracteres, palavras, vogais, consoantes, espaços e números.

## Tecnologias e conceitos utilizados

### Linguagem e ferramentas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JDK](https://img.shields.io/badge/JDK-Development%20Kit-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Scanner](https://img.shields.io/badge/Java-Scanner-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Git-Versionamento-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-Reposit%C3%B3rio-181717?style=for-the-badge&logo=github&logoColor=white)

### Conceitos de programação

![POO](https://img.shields.io/badge/POO-Programa%C3%A7%C3%A3o%20Orientada%20a%20Objetos-007396?style=for-the-badge)
![Encapsulamento](https://img.shields.io/badge/POO-Encapsulamento-4682B4?style=for-the-badge)
![Estruturas de Controle](https://img.shields.io/badge/Java-Estruturas%20de%20Controle-DAA520?style=for-the-badge)
![Manipulação de Strings](https://img.shields.io/badge/Java-Manipula%C3%A7%C3%A3o%20de%20Strings-6A5ACD?style=for-the-badge)

O projeto utiliza os seguintes recursos da linguagem:

- **Programação Orientada a Objetos (POO):** organização do código em classes com responsabilidades distintas.
- **Encapsulamento:** utilização de atributos privados e métodos de acesso na classe `Text`.
- **Estruturas condicionais:** aplicação de `if`, `else` e `switch`.
- **Estruturas de repetição:** utilização de `for` e `do-while`.
- **Manipulação de strings:** operações de busca, substituição, extração e divisão de textos.
- **Entrada de dados:** utilização da classe `Scanner` para receber informações pelo terminal.

### Métodos de manipulação de texto

| Método | Finalidade |
|---|---|
| `length()` | Retorna o comprimento da string. |
| `split()` | Divide a string em partes. |
| `contains()` | Verifica se uma sequência está presente no texto. |
| `indexOf()` | Retorna a posição da primeira ocorrência encontrada. |
| `replace()` | Substitui todas as ocorrências literais correspondentes. |
| `replaceFirst()` | Substitui a primeira ocorrência correspondente a uma expressão regular. |
| `substring()` | Extrai uma parte da string utilizando índices. |
| `toUpperCase()` | Converte letras para maiúsculas. |
| `toLowerCase()` | Converte letras para minúsculas. |
| `trim()` | Remove espaços em branco das extremidades da string. |

## Arquitetura do projeto

![Controller](https://img.shields.io/badge/Camada-Controller-007396?style=flat-square)
![Model](https://img.shields.io/badge/Camada-Model-2E8B57?style=flat-square)
![Service](https://img.shields.io/badge/Camada-Service-9370DB?style=flat-square)

O projeto está organizado em três pacotes principais:

```text
src/
└── br/
    └── com/
        └── TextAnalyzer/
            ├── controller/
            │   └── Main.java
            ├── model/
            │   └── Text.java
            └── service/
                └── TextService.java
```

### `Main.java`

![Controller](https://img.shields.io/badge/Responsabilidade-Controller-007396?style=flat-square)

Responsável por iniciar o fluxo de execução da aplicação e acionar a camada de serviço.

### `Text.java`

![Model](https://img.shields.io/badge/Responsabilidade-Model-2E8B57?style=flat-square)

Representa o texto manipulado pelo programa, armazenando seu conteúdo por meio de um atributo privado e disponibilizando métodos de acesso.

### `TextService.java`

![Service](https://img.shields.io/badge/Responsabilidade-Service-9370DB?style=flat-square)

Concentra a lógica de interação com o usuário e as operações de análise e manipulação de texto.

Essa organização separa a representação dos dados, o fluxo inicial da aplicação e as operações realizadas sobre o texto.

## Pré-requisitos

![Java](https://img.shields.io/badge/Java-JDK%20Compat%C3%ADvel-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Terminal](https://img.shields.io/badge/Execu%C3%A7%C3%A3o-Terminal-555555?style=for-the-badge)

Para executar o projeto, você precisará de:

- Java Development Kit (JDK) compatível com os recursos utilizados no código.
- Terminal ou IDE com suporte a Java.
- Git, caso deseje clonar o repositório.

## Instalação e execução

### 1. Clone o repositório

Substitua `SEU_USUARIO` e `NOME_DO_REPOSITORIO` pelos dados do seu repositório no GitHub.

```bash
git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
```

### 2. Acesse a pasta do projeto

```bash
cd NOME_DO_REPOSITORIO
```

### 3. Compile os arquivos

Considerando que a estrutura de diretórios seja igual à apresentada anteriormente:

```bash
javac -d out src/br/com/TextAnalyzer/model/Text.java src/br/com/TextAnalyzer/service/TextService.java src/br/com/TextAnalyzer/controller/Main.java
```

### 4. Execute a aplicação

```bash
java -cp out br.com.TextAnalyzer.controller.Main
```

> **Observação:** os comandos pressupõem que a classe `Main` possua um método de entrada compatível com a versão do Java utilizada.

## Exemplo de utilização

![Interface CLI](https://img.shields.io/badge/Interface-Console-555555?style=flat-square)

Ao iniciar a aplicação, o usuário informa um texto:

```text
Digite um texto: Java facilita o desenvolvimento de aplicações
```

Em seguida, pode selecionar uma das operações disponíveis no menu.

```text
========== TEXT ANALYZER ==========

1. Contar caracteres
2. Contar palavras
3. Encontrar uma palavra
4. Substituir uma palavra
5. Extrair parte do texto
6. Exibir palavras separadamente
7. Exibir estatísticas completas
0. Sair
```

A partir desse menu, o usuário pode realizar diferentes operações sem precisar modificar o código-fonte.

## Testes e validação

![Testes](https://img.shields.io/badge/Testes-Manuais-6A5ACD?style=for-the-badge)
![JUnit](https://img.shields.io/badge/Testes%20Automatizados-Planejado-25A162?style=for-the-badge&logo=junit5&logoColor=white)

O projeto pode ser validado inicialmente por meio de testes manuais no terminal.

Cenários recomendados:

- [ ] Informar um texto vazio.
- [X] Inserir espaços consecutivos entre palavras.
- [ ] Procurar uma palavra inexistente.
- [ ] Procurar um termo que aparece dentro de outra palavra.
- [X] Substituir termos que aparecem várias vezes no texto.
- [X] Informar índices inválidos durante a extração de trechos.
- [X] Digitar letras quando o programa solicitar um número.
- [X] Analisar textos contendo acentos, pontuação e números.

A implementação de testes automatizados com JUnit pode ser considerada em uma evolução futura do projeto.

## Roadmap

![Roadmap](https://img.shields.io/badge/Roadmap-Evolu%C3%A7%C3%A3o%20do%20Projeto-0078D4?style=for-the-badge)

- [X] Aprimorar a validação de entradas numéricas e textuais.
- [X] Melhorar o tratamento de erros durante a interação com o usuário.
- [X] Aprimorar a identificação de palavras, considerando diferentes espaços em branco e pontuações.
- [X] Aprimorar a análise de caracteres acentuados.
- [X] Avaliar melhorias na separação de responsabilidades entre as camadas.
- [X] Revisar a documentação e os exemplos de utilização após a evolução do projeto.

## Objetivo de aprendizagem

O Text Analyzer representa uma oportunidade de consolidar conhecimentos de Java por meio da construção de uma aplicação funcional.

O desenvolvimento permite praticar manipulação de strings, validação de dados, estruturas de controle, organização de classes e tratamento de casos extremos.

O projeto também serve como base para futuras melhorias relacionadas à qualidade, à legibilidade e à manutenção do código.

## Autor

**Cauê Vieira Lopes**

[![GitHub](https://img.shields.io/badge/GitHub-Perfil-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/cauevieiraLopes)
