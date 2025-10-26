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

    public static void main(String[] args) {
        Interface.exibirMenuPrincipal();
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



