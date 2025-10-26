package TAD;


/**
 * 2. Crie uma classe Pilha que permita empilhar e desempilhar valores inteiros.
 * Use os métodos empilhar(int valor) e desempilhar().
 */


import java.util.ArrayList;

public class Pilha {
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
