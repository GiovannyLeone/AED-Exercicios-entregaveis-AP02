import java.util.InputMismatchException;
import java.util.Scanner;

public class Interface {
    // Instâncias das classes TAD para serem usadas no menu
    private static TAD.Lista lista = new TAD.Lista();
    private static TAD.Pilha pilha = new TAD.Pilha();
    private static TAD.Fila fila = new TAD.Fila();
    private static Scanner scanner = new Scanner(System.in);

    static void exibirMenuPrincipal() {
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

}
