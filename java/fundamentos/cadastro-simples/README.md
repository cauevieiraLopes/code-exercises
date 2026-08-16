# 📅 Cadastro e calculadora de idade com `java.time`

Aplicação simples de terminal desenvolvida em Java para praticar o uso da API moderna de datas (`java.time`), realizando a leitura da data de nascimento de um usuário e o cálculo automático de sua idade atual.

---

## 🎯 Objetivos de Aprendizado

- **Instanciação com `.of()`:** Criação de um objeto `LocalDate` a partir de valores inteiros informados pelo usuário (ano, mês e dia).
- **Captura da Data Atual (`.now()`):** Utilização de `LocalDate.now()` para obter a data do sistema operacional no momento da execução.
- **Cálculo de Intervalos com `Period`:** Uso da classe `Period.between()` para calcular a diferença temporal entre duas datas e extrair a idade em anos completos com `.getYears()`.

---

## 🛠️ Como Executar

1. Certifique-se de ter o **JDK 8+** instalado em sua máquina.
2. Navegue até a pasta onde está o arquivo `Main.java` no terminal.
3. Compile o código:
```bash
javac Main.java
```
4. Execute o programa:
```Bash
java Main
```

---

# 👤 Autor
Cauê Vieira Lopes - [Perfil no Git-Hub](https://github.com/cauevieiraLopes)
