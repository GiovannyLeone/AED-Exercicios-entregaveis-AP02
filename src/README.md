Claro\! Criarei um `README.md` completo e bem formatado, utilizando Markdown para um visual limpo e bonito, cobrindo todos os detalhes do seu projeto de Tipos Abstratos de Dados (TDA) em Java.

## 🚀 Estruturas de Dados em Java: TDA Lista, Pilha e Fila

Este projeto é uma implementação didática de três Tipos Abstratos de Dados (TDA) fundamentais: Lista, Pilha e Fila. O objetivo é demonstrar o funcionamento e as restrições de cada estrutura, conforme especificado na lista de exercícios da disciplina.

-----

### 📋 Requisitos do Projeto

O projeto resolve os 5 exercícios propostos, implementando as estruturas baseadas em vetores (simulados por `ArrayList` em Java), com capacidade máxima definida e um menu interativo de testes.

| \# | TDA | Funcionalidades Implementadas | Restrições |
| :---: | :--- | :--- | :--- |
| **1** | **Lista** | `inserir(int valor)`, `mostrar()` | Máximo de **5** elementos. |
| **2** | **Pilha** | `empilhar(int valor)`, `desempilhar()`, `mostrar()` | LIFO (Last-In, First-Out), Máximo de **5** elementos. |
| **3** | **Fila** | `enfileirar(int valor)`, `desenfileirar()`, `mostrar()` | FIFO (First-In, First-Out), Máximo de **5** elementos. |
| **4** | **Geral** | Método `mostrar()` em todas as classes. | Exibe o estado atual da estrutura. |
| **5** | **Principal** | Menu Interativo | Interface de linha de comando para testar as estruturas. |

-----

### 💻 Como Executar o Projeto

Este projeto foi desenvolvido em Java e pode ser compilado e executado em qualquer ambiente que suporte o Java 17 ou superior (incluindo o Java 21).

#### 1\. Estrutura de Arquivos

O código está contido em um único arquivo chamado `Principal.java`, utilizando classes aninhadas estáticas para organizar os TDAs.

```
.
└── src/
    └── Principal.java
```

#### 2\. Compilação e Execução

Abra o terminal na pasta raiz do projeto (`src/`) e use os seguintes comandos:

```bash
# 1. Compilação
javac Principal.java

# 2. Execução
java Principal
```

Ao executar, o programa iniciará o menu interativo no console.

-----

### 📖 Guia de Uso do Menu Interativo

O menu permite que você escolha qual estrutura de dados deseja testar, executando as operações específicas de cada TDA.

#### Menu Principal

```
===========================================
--- Menu Interativo TDA Estruturas de Dados ---
===========================================
1. Testar LISTA (Máx: 5 elementos)
2. Testar PILHA (LIFO)
3. Testar FILA (FIFO, Máx: 5 elementos)
0. Sair do Programa
```

#### Exemplo de Teste (Pilha)

1.  Selecione a opção **2 (Testar PILHA)**.
2.  No menu da pilha, selecione **1 (Empilhar)** e insira um valor (Ex: `10`).
3.  Repita o passo 2 (Ex: `20`).
4.  Selecione **3 (Mostrar estado)**. O resultado deve ser `[10, 20]`, onde `20` é o topo.
5.  Selecione **2 (Desempilhar)**. O valor `20` será removido.
6.  Selecione **3 (Mostrar estado)**. O resultado deve ser `[10]`.

-----

### 🛠️ Detalhes da Implementação

As classes utilizam a classe `java.util.ArrayList` para simular o comportamento de um vetor de armazenamento, mas impõem as regras de capacidade máxima e as lógicas de inserção/remoção (FIFO, LIFO) através de métodos customizados e tratamento de exceções (`try-catch`).

| TDA | Operação de Inserção | Operação de Remoção | Limite |
| :--- | :--- | :--- | :--- |
| **Lista** | `arrayLista.add(valor)` | N/A (Não possui) | **5** (Imposto por verificação `size()`) |
| **Pilha** | `arrayPilha.add(valor)` (PUSH) | `arrayPilha.removeLast()` (POP) | **5** (Imposto por verificação `size()`) |
| **Fila** | `arrayFila.add(valor)` (ENQUEUE) | `arrayFila.removeFirst()` (DEQUEUE) | **5** (Imposto por verificação `size()`) |

-----

### 👤 Autor

* **Professor:** Odair Gabriel
* **Autor:** Giovanny Leone
* **RA:** 2402464
* **Curso:** Ciência da Computação – Noite | 3º Semestre Turma A

-----

*Desenvolvido como parte dos estudos de Estruturas de Dados em Java.*