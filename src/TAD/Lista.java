package TAD;

/**
 * 1. Implemente uma classe Lista que use um vetor de inteiros para armazenar até 5 elementos.
 * Adicione os métodos inserir(int valor) e mostrar().
 */

import java.util.ArrayList;

public class Lista {
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
