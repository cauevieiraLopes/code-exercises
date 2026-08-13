# 🎓 Sistema de Leitura e Validação de Notas (Array de Objetos em Java)

Aplicação desenvolvida em Java para cadastrar uma lista de estudantes e suas respectivas notas acadêmicas, utilizando **Arrays de Objetos**, validações de entrada, cálculo de médias e estrutura organizada em camadas (Controller, Model e Service).

---

## 🎯 Objetivos de Aprendizado

- **Array de Objetos (`Student[]`):** Alocação e manipulação de vetores que armazenam instâncias de objetos na memória.
- **Validação de Entrada com Laço de Repetição (`while`):** Garantia de integridade dos dados digitados (notas restritas ao intervalo entre 0 e 10).
- **Tratamento do Buffer do `Scanner`:** Resolução da quebra de linha ao alternar leituras numéricas (`nextDouble`) e textuais (`nextLine`).
- **Encapsulamento & Métodos Auxiliares:** Abstração de regras de cálculo de média e regras de aprovação.

---

## 🛠️ Estrutura do Projeto

```text
src/
└── br/com/leituraNotas/
    ├── controller/
    │   └── Main.java         → Instanciação do Array de Estudantes e orquestração.
    ├── model/
    │   └── Student.java      → Classe Modelo (Atributos privados, getters e setters).
    └── service/
        └── Service.java      → Lógica de cadastro, validação de notas, média e exibição.
```
---

## 🚀 Como Executar
Navegue até a pasta src do projeto no terminal e execute os comandos:
```Bash
# Compilar todas as camadas
javac br/com/leituraNotas/model/Student.java br/com/leituraNotas/service/Service.java br/com/leituraNotas/controller/Main.java

# Executar a aplicação
java br.com.leituraNotas.controller.Main
```

---

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
