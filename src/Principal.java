/*
 * ==========================================================
 *   Lista de Exercícios – TAD Estruturas de Dados em Java
 *   Professor: Odair Gabriel
 *   Autor: Giovanny Leone | RA: 2402464
 *   Curso: Ciência da Computação – Noite | 3° Semestre Turma A
 * ==========================================================
 */


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    // Instâncias das classes TAD para serem usadas no menu
    private static Lista lista = new Lista();
    private static Pilha pilha = new Pilha();
    private static Fila fila = new Fila();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\n===========================================");
            System.out.println("--- Menu Interativo TAD Estruturas de Dados ---");
            System.out.println("===========================================");
            System.out.println("1. Testar LISTA (Máx: 5 elementos)");
            System.out.println("2. Testar PILHA (LIFO)");
            System.out.println("3. Testar FILA (FIFO, Máx: 5 elementos)");
            System.out.println("0. Sair do Programa");
            System.out.println("-------------------------------------------");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        menuLista();
                        break;
                    case 2:
                        menuPilha();
                        break;
                    case 3:
                        menuFila();
                        break;
                    case 0:
                        System.out.println("\nEncerrando o programa. Até logo!");
                        break;
                    default:
                        System.out.println("\nOpção inválida. Por favor, escolha 0, 1, 2 ou 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Consome a entrada inválida
                opcao = -1;
            }
        } while (opcao != 0);
        scanner.close();
    }

    private static void menuLista() {
        int opcao;
        do {
            System.out.println("\n--- Operações na LISTA ---");
            System.out.println("1. Inserir valor (Máx 5)");
            System.out.println("2. Mostrar estado da Lista");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor a ser inserido: ");
                        int valorInserir = scanner.nextInt();
                        lista.inserir(valorInserir);
                        break;
                    case 2:
                        lista.mostrar();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
                opcao = -1;
            }
        } while (opcao != 0);
    }

    private static void menuPilha() {
        int opcao;
        do {
            System.out.println("\n--- Operações na PILHA (LIFO) ---");
            System.out.println("1. Empilhar valor (PUSH)");
            System.out.println("2. Desempilhar valor (POP)");
            System.out.println("3. Mostrar estado da Pilha");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor a ser empilhado: ");
                        int valorEmpilhar = scanner.nextInt();
                        pilha.empilhar(valorEmpilhar);
                        break;
                    case 2:
                        pilha.desempilhar();
                        break;
                    case 3:
                        pilha.mostrar();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
                opcao = -1;
            }
        } while (opcao != 0);
    }

    private static void menuFila() {
        int opcao;
        do {
            System.out.println("\n--- Operações na FILA (FIFO) ---");
            System.out.println("1. Enfileirar valor (Enqueue - Máx 5)");
            System.out.println("2. Desenfileirar valor (Dequeue)");
            System.out.println("3. Mostrar estado da Fila");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor a ser enfileirado: ");
                        int valorEnfileirar = scanner.nextInt();
                        fila.enfileirar(valorEnfileirar);
                        break;
                    case 2:
                        fila.desenfileirar();
                        break;
                    case 3:
                        fila.mostrar();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
                opcao = -1;
            }
        } while (opcao != 0);
    }

    /**
     * 1. Implemente uma classe Lista que use um vetor de inteiros para armazenar até 5 elementos.
     * Adicione os métodos inserir(int valor) e mostrar().
     */

    static class Lista {
        // Estrutura interna da lista (armazenamento dinâmico)
        private ArrayList<Integer> arrayLista;

        /**
         * Construtor da classe.
         * Inicializa o ArrayList vazio ao criar uma nova lista.
         */
        public Lista() {
            this.arrayLista = new ArrayList<>();
        }

        /**
         * Método inserir
         * Tenta adicionar um novo valor na lista.
         * Caso a lista já possua 5 elementos, o método gera uma exceção.
         *
         * @param valor o número inteiro a ser inserido na lista.
         */
        public void inserir(int valor) {
            try {
                // Verifica se o limite de 5 elementos foi atingido
                if (this.arrayLista.size() >= 5) {
                    // Cria e lança uma exceção com mensagem personalizada
                    throw new Exception("A lista já contém 5 elementos. Não é possível inserir mais.");
                }

                // Adiciona o valor à lista se houver espaço
                this.arrayLista.add(valor);
                System.out.println("Valor " + valor + " inserido com sucesso.");

            } catch (Exception e) {
                // Captura e exibe a mensagem de erro
                System.out.println("Erro ao inserir: " + e.getMessage());
            }
        }

        /**
         * Método mostrar
         * Exibe no console todos os elementos armazenados na lista.
         * Caso a lista esteja vazia, lança uma exceção tratada pelo try/catch.
         */
        public void mostrar() {
            try {
                // Verifica se há elementos para mostrar
                if (this.arrayLista.isEmpty()) {
                    throw new Exception("A lista está vazia. Nada para mostrar.");
                }

                // Exibe o conteúdo da lista no console
                System.out.println("Elementos da lista: " + this.arrayLista);

            } catch (Exception e) {
                // Captura e mostra mensagem de erro
                System.out.println("Erro ao mostrar: " + e.getMessage());
            }
        }
    }

    /*
     *FIM EXERCÍCIO 1
     */


    /**
     * 2. Crie uma classe Pilha que permita empilhar e desempilhar valores inteiros.
     * Use os métodos empilhar(int valor) e desempilhar().
     */

    static class Pilha {
        // Estrutura interna da pilha (armazenamento dinâmico)
        private ArrayList<Integer> arrayPilha;

        /**
         * Construtor da classe.
         * Inicializa o ArrayList vazio ao criar uma nova pilha.
         */
        public Pilha() {
            this.arrayPilha = new ArrayList<>();
        }

        /**
         * Método empilhar
         * Tenta adicionar um novo valor inteiro na pilha.
         *
         * @param valor o número inteiro a ser inserido na pilha.
         */
        public void empilhar(int valor) {
            try {
                // Adiciona o valor à pilha
                this.arrayPilha.add(valor);
                System.out.println("Valor " + valor + " empilhado com sucesso.");

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        /**
         * Método desempilhar
         * Tenta remover o ultimo valor inteiro na pilha.
         * Caso a lista esteja vazia, lança uma exceção tratada pelo try/catch.
         */
        public void desempilhar() {
            try {
                if (this.arrayPilha.isEmpty()) {
                    throw new Exception("A pilha está vazia. é necessário adicionar um valor, antes de remover.");
                }
                // Remove o último valor à pilha
                System.out.println("O último valor da pilha: " + this.arrayPilha.getLast() + " foi removido com sucesso.");
                this.arrayPilha.removeLast();


            } catch (Exception e) {
                // Captura e mostra mensagem de erro
                System.out.println("Erro ao mostrar: " + e.getMessage());
            }
        }

        /**
         * Método mostrar
         * Exibe no console todos os elementos armazenados na pilha.
         * Caso a pilha esteja vazia, lança uma exceção tratada pelo try/catch.
         */
        public void mostrar() {
            try {
                if (this.arrayPilha.isEmpty()) {
                    throw new Exception("A pilha está vazia. Nada para mostrar.");
                }

                // Exibe o conteúdo da pilha no console
                System.out.println("Elementos da pilha: " + this.arrayPilha);

            } catch (Exception e) {
                System.out.println("Erro ao mostrar: " + e.getMessage());
            }
        }
    }

    /*
     *FIM EXERCÍCIO 2
     */

    /**
     * 3. Implemente uma classe Fila que use um vetor de inteiros para simular uma fila
     * de até 5 posições.
     * Inclua os métodos enfileirar(int valor) e desenfileirar()
     */

    static class Fila {
        // Estrutura interna da pilha (armazenamento dinâmico)
        private ArrayList<Integer> arrayFila;

        /**
         * Construtor da classe.
         * Inicializa o arrayFila vazio ao criar uma nova pilha.
         */
        public Fila() {
            this.arrayFila = new ArrayList<>();
        }

        /**
         * Método enfileirar
         * Tenta adicionar um novo valor inteiro na fila.
         *
         * @param valor o número inteiro a ser inserido na fila.
         */
        public void enfileirar(int valor) {
            try {
                // Verifica se o limite de 5 elementos foi atingido
                if (this.arrayFila.size() >= 5) {
                    // Cria e lança uma exceção com mensagem personalizada
                    throw new Exception("A fila já contém 5 elementos. Não é possível inserir mais.");
                }

                // Adiciona o valor à fila se houver espaço
                this.arrayFila.add(valor);
                System.out.println("Valor " + valor + " inserido com sucesso.");

            } catch (Exception e) {
                // Captura e exibe a mensagem de erro
                System.out.println("Erro ao inserir: " + e.getMessage());
            }
        }

        /**
         * Método desenfileirar
         * Tenta adicionar um novo valor inteiro na fila.
         *
         *
         */
        public void desenfileirar() {
            try {
                // Verifica se há elementos para desenfileirar
                if (this.arrayFila.isEmpty()) {
                    throw new Exception("A lista está vazia. Nada para desenfileirar.");
                }
                // Remove o primeiro valor da fila
                System.out.println("O primeiro valor da pilha: " + this.arrayFila.getFirst() + " foi removido com sucesso.");
                this.arrayFila.removeFirst();


            } catch (Exception e) {
                System.out.println("Erro ao mostrar: " + e.getMessage());
            }
        }

        /**
         * Método mostrar
         * Exibe no console todos os elementos armazenados na fila.
         * Caso a lista esteja vazia, lança uma exceção tratada pelo try/catch.
         */
        public void mostrar() {
            try {
                if (this.arrayFila.isEmpty()) {
                    throw new Exception("A lista está vazia. Nada para mostrar.");
                }

                // Laço for para iterar e exibir o índice e o valor da fila
                for (int i = 0; i < this.arrayFila.size(); i++) {
                    System.out.println("Índice: " + i + ", Valor: " + this.arrayFila.get(i));
                }

            } catch (Exception e) {
                System.out.println("Erro ao mostrar: " + e.getMessage());
            }

        }
    }
    /*
     *FIM EXERCÍCIO 3
     */


}



