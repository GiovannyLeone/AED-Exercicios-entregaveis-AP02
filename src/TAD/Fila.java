package TAD;

/**
 * 3. Implemente uma classe Fila que use um vetor de inteiros para simular uma fila
 * de até 5 posições.
 * Inclua os métodos enfileirar(int valor) e desenfileirar()
 */

import java.util.ArrayList;

public class Fila {
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
