## 📚 Implementação de Tipos Abstratos de Dados (TAD) em Java

### Arquitetura de Pacotes: Lista, Pilha e Fila

Este projeto demonstra a implementação de três Tipos Abstratos de Dados (TAD) fundamentais: **Lista**, **Pilha (Stack)** e **Fila (Queue)**, organizados sob uma arquitetura de pacotes modular. O objetivo é simular o comportamento e as restrições de estruturas baseadas em vetor (capacidade limitada), encapsulando a lógica de cada TAD em seu próprio arquivo.

-----

### 📦 Estrutura de Arquivos e Organização

O projeto utiliza uma estrutura de pacotes padrão Java, separando a lógica de negócios (TADs) da camada de execução (`Principal`).

```
src/
├── TAD/
│   ├── Fila.java     // Implementação TAD Fila (FIFO, Máx 5)
│   ├── Lista.java    // Implementação TAD Lista (Máx 5)
│   └── Pilha.java    // Implementação TAD Pilha (LIFO, Máx 5)
│
├── Interface.java    // (Presumível: Define o contrato/métodos comuns - Não usada neste modelo)
└── Principal.java    // Classe Principal com o menu interativo de testes
```

### 📋 Requisitos e Solução dos Exercícios

Todas as restrições do enunciado foram atendidas, incluindo a capacidade limitada de 5 elementos e a implementação do método `mostrar()` em todas as estruturas.

|     TAD     | Arquivo | Funcionalidades Principais | Princípio de Acesso | Restrição de Capacidade |
|:---------:| :--- | :--- | :--- | :---: |
| **Lista** | `TAD/Lista.java` | `inserir(valor)`, `mostrar()` | Sequencial | Máximo: **5** |
| **Pilha** | `TAD/Pilha.java` | `empilhar(valor)`, `desempilhar()`, `mostrar()` | LIFO | Máximo: **5** |
| **Fila**  | `TAD/Fila.java` | `enfileirar(valor)`, `desenfileirar()`, `mostrar()` | FIFO | Máximo: **5** |

-----

### 🛠️ Detalhes da Implementação Técnica

As classes no pacote `TAD` utilizam `java.util.ArrayList<Integer>` como mecanismo interno de armazenamento, mas simulam o comportamento de um vetor de tamanho fixo através de controle de fluxo e exceções.

#### 1\. Encapsulamento e Controle de Fluxo

* **Capacidade Fixa:** O limite de 5 elementos é imposto nos métodos de inserção (`inserir`, `empilhar`, `enfileirar`) através da verificação do `size()` do `ArrayList`.
* **Tratamento de Erros:** O código utiliza `try-catch` para capturar e reportar explicitamente situações como *Estrutura Cheia* ou *Estrutura Vazia* (ex: ao tentar `desempilhar` uma pilha vazia).

#### 2\. Implementação LIFO e FIFO

A correta aplicação dos princípios de acesso é garantida pelo uso estratégico dos métodos de manipulação de extremidades do `ArrayList`:

|        TAD         | Operação | Método do `ArrayList` Utilizado |
|:----------------:| :--- | :--- |
| **Pilha (LIFO)** | `desempilhar()` | `removeLast()` |
| **Fila (FIFO)**  | `desenfileirar()` | `removeFirst()` |

-----

### 🚀 Execução e Testes

A classe `Principal.java` contém o método `main` e o menu interativo para testar as estruturas de forma isolada.

#### Pré-requisitos

* Java Development Kit (JDK) 17 ou superior.

#### Instruções de Compilação e Execução

Para compilar e executar um projeto com pacotes, você deve usar o terminal na raiz do diretório `src/`:

```bash
# 1. Compilar os arquivos (incluindo o pacote TAD)
javac TAD/*.java Principal.java

# 2. Executar o programa
java Principal
```

#### Menu Interativo (`Principal`)

A classe `Principal` permite ao usuário selecionar qual TAD testar, guiando as operações de inserção, remoção e visualização.

-----

### 👨‍🏫 Informações do Aluno

| Detalhe | Valor                         |
| :--- |:------------------------------|
| **Autor** | Giovanny Leone                |
| **RA** | 2402464                       |
| **Curso** | Ciência da Computação         |
| **Disciplina** | TAD Estruturas de Dados em Java |

-----