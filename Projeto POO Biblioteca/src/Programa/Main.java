package Programa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(); // Cria uma nova instância da classe Biblioteca
        Scanner l = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        int op; // Variável para armazenar a opção escolhida pelo usuário
        boolean lastCase = false; // Variável para indicar se o último caso foi executado

        do {
            biblioteca.menu(); // Exibe o menu da biblioteca

            op = Integer.parseInt(l.nextLine()); // Lê a opção escolhida pelo usuário

            switch (op) {
                case 1:
                    System.out.print("\033[H\033[2J"); // Limpa a tela
                    System.out.print("Digite o nome do livro: ");
                    String nome = l.nextLine(); // Lê o nome do livro
                    System.out.print("Digite o código do livro: ");
                    int codigo = Integer.parseInt(l.nextLine()); // Lê o código do livro
                    System.out.print("Digite o gênero do livro: ");
                    String genero = l.nextLine(); // Lê o gênero do livro
                    System.out.print("Digite o autor do livro: ");
                    String autor = l.nextLine(); // Lê o autor do livro
                    Livro livro = new Livro(nome, codigo, genero, autor); // Cria um novo objeto Livro com os dados fornecidos
                    biblioteca.cadastrarLivro(livro); // Registra o livro na biblioteca
                    System.out.println("Livro cadastrado com sucesso!");
                    System.out.println("");
                    biblioteca.pause(lastCase); // Pausa a execução e aguarda a interação do usuário
                    break;

                case 2:
                    System.out.print("\033[H\033[2J"); // Limpa a tela
                    System.out.print("Digite o código do livro: ");
                    int buscacodigo = Integer.parseInt(l.nextLine()); // Lê o código do livro a ser consultado
                    Livro livroConsulta = biblioteca.consultarLivro(buscacodigo); // Consulta o livro na biblioteca
                    if (livroConsulta != null) {
                        livroConsulta.imprimir(); // Imprime os detalhes do livro
                        biblioteca.pause(lastCase);
                    } else {
                        System.out.println("Livro não encontrado!");
                        biblioteca.pause(lastCase);
                    }
                    break;
                case 3:
                    System.out.print("\033[H\033[2J"); // Limpa a tela
                    biblioteca.listarLivros(); // Lista todos os livros da biblioteca
                    biblioteca.pause(lastCase);
                    break;
                case 4:
                    System.out.print("\033[H\033[2J"); // Limpa a tela
                    System.out.print("Digite o gênero do livro: ");
                    String generoConsulta = l.nextLine(); // Lê o gênero do livro a ser consultado
                    biblioteca.consultarPorGenero(generoConsulta); // Consulta os livros por gênero
                    biblioteca.pause(lastCase);
                    break;
                case 5:
                    System.out.print("\033[H\033[2J"); // Limpa a tela
                    System.out.print("Digite o autor do livro: ");
                    String autorConsulta = l.nextLine(); // Lê o autor do livro a ser consultado
                    biblioteca.consultarPorAutor(autorConsulta); // Consulta os livros por autor
                    biblioteca.pause(lastCase);
                    break;
                case 6:
                    System.out.print("\033[H\033[2J"); // Limpa a tela
                    System.out.print("Digite o código do livro: ");
                    int codigoEmprestimo = Integer.parseInt(l.nextLine()); // Lê o código do livro para empréstimo
                    Livro livroEmprestimo = biblioteca.consultarLivro(codigoEmprestimo); // Consulta o livro na biblioteca
                    if (livroEmprestimo != null) {
                        System.out.print("Digite a data de empréstimo (dd/mm/aaaa): ");
                        String dataEmprestimo = l.nextLine(); // Lê a data de empréstimo
                        System.out.print("Digite a data de devolução (dd/mm/aaaa): ");
                        String dataDevolucao = l.nextLine(); // Lê a data de devolução
                        Emprestimo emprestimo = new Emprestimo(livroEmprestimo, dataEmprestimo, dataDevolucao); // Cria um novo objeto Emprestimo
                        biblioteca.realizarEmprestimo(emprestimo); // Realiza o empréstimo do livro
                        System.out.println("Empréstimo realizado com sucesso!");
                        biblioteca.pause(lastCase);
                    } else {
                        System.out.println("Livro não encontrado!");
                        biblioteca.pause(lastCase);
                    }
                    break;
                case 7:
                    System.out.print("\033[H\033[2J"); // Limpa a tela
                    System.out.println("Saindo...");
                    lastCase = true; // Define lastCase como true para indicar que o último caso foi executado
                    biblioteca.pause(lastCase);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    biblioteca.pause(lastCase);
                    break;
            }
        } while (op != 7); // Repete o loop enquanto a opção escolhida não for 7 (sair)

        l.close(); // Fecha o objeto Scanner
    }
}
