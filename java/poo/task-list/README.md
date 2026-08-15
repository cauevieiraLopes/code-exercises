# 📝 Gerenciador de Tarefas (ArrayList e Construtores em Java)

Uma aplicação de terminal para gerenciamento de tarefas (*To-Do List*) desenvolvida em Java, aplicando conceitos dinâmicos de coleções de dados com **`ArrayList`**, uso de **Construtores**, **Encapsulamento** e separação em camadas de arquitetura.

---

## 🎯 Objetivos de Aprendizado e Avanços

- **Coleções Dinâmicas (`List` / `ArrayList`):** Armazenamento dinâmico de objetos em memória, permitindo inclusão e acesso sem limitação de tamanho fixo.
- **Polimorfismo em Coleções:** Declaração do atributo usando a interface `List<ModelTask>` e instanciação com a implementação `ArrayList<>`.
- **Construtores Personalizados:** Inicialização de atributos obrigatórios no momento da instanciação (`new ModelTask(receberTarefa)`), definindo valores padrão.
- **Validação e Controle de Limites de Array:** Garantia de acesso seguro aos índices da lista (`0` até `size() - 1`) para evitar exceções de limite de memória (*IndexOutOfBoundsException*).
- **Sanitização de Dados:** Uso de `.trim()` no construtor para higienização de strings recebidas via terminal.

---

## 🛠️ Estrutura do Projeto

```text
src/
└── br/com/taskList/
    ├── controller/
    │   └── Main.java         → Menu interativo, controle de fluxo e leitura inicial.
    ├── model/
    │   └── ModelTask.java    → Entidade Tarefa com construtor, atributos e getters/setters.
    └── service/
        └── ServiceTask.java  → Gerenciamento do ArrayList (criar, listar e concluir tarefas).
```

---

## 🚀 Como Executar

1. Navegue até a pasta src do projeto no terminal.

2. Compile todas as camadas:

```Bash
javac br/com/taskList/model/ModelTask.java br/com/taskList/service/ServiceTask.java br/com/task
```

3. Execute a aplicação:
```bash
java br.com.taskList.controller.Main
```

---

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
