package Programa;

import java.util.Scanner;

//Classe Biblioteca
public class Biblioteca { 
    public static final String biblioteca = null;
    //Atributos

    private Livro[] livros; // Array de objetos do tipo Livro para armazenar os livros da biblioteca.
    private Emprestimo[] emprestimos; // Array de objetos do tipo emprestimo.
    private int numLivros; // Inteiro para armazenar a quantidade de livros cadastrados.
    private int numEmprestimos; //Inteiro para armazenar a quantidade livros emprestados da biblioteca.

    // Contrutor Biblioteca : criado para inciar os atributos da classe.

    public Biblioteca() { 
        livros = new Livro[10]; // Array livros com o tamanho de 10.
        emprestimos = new Emprestimo[10]; // Array Emprestimo de 10.
        // Atribuindo valor 0 a dois inteiros numLivros e numEmprestimos.
        numLivros = 0; 
        numEmprestimos = 0;
    }

    // Métodos
    public void cadastrarLivro(Livro livro) { 
        //Recebe um objeto do tipo Livro em parâmetro e armazena em um array chamado livro e somando +1 no contador numLivro++
        livros[numLivros] = livro;
        numLivros++;
    }

    public Livro consultarLivro(int codigo) {
        // Recebe o código(código de barras) do livro e itera sobre o array livros para encontrar o livro, se o livro for encontrado
        // ele retornada o livro, se nenhum livro for encontrado ele retorna null.
        for (int i = 0; i < numLivros; i++) {
            if (livros[i].getCodigo() == codigo) {
                return livros[i];
            }
        }
        return null;
    }

    public void listarLivros() {
        // Nesta função só ira listar a array livros e chamar a função imprimir para mostrar os detalhes de todos os livros.
        for (int i = 0; i < numLivros; i++) {
            System.out.println("-------------------------------");
            livros[i].imprimir();
            System.out.println("-------------------------------");
        }
    }

    public void consultarPorGenero(String genero) {
        // Recebe um gênero como parâmetro e procura sobre a array livros até encontrar o gênero correspondente
        // imprimi também todos os livros deste genero encontrado.
        boolean encontrado = false;
        for (int i = 0; i < numLivros; i++) {
            if (livros[i].getGenero().equalsIgnoreCase(genero)) {
                livros[i].imprimir();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro encontrado com esse gênero!");
        }
    }

    public void consultarPorAutor(String autor) {
        boolean encontrado = false;
        for (int i = 0; i < numLivros; i++) {
            if (livros[i].getAutor().equalsIgnoreCase(autor)) {
                livros[i].imprimir();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro encontrado com esse autor!");
        }
    }

    public void realizarEmprestimo(Emprestimo emprestimo) {
        // recebe um objeto do tipo emprestimo e adiona-o na array emprestimos, e somando +1 no contador numEmprestimos;
        emprestimos[numEmprestimos] = emprestimo;
        numEmprestimos++;
    }

    public void pause(boolean lastCase) {
        // Recebe um valor booleano chamado lastCase e realiza uma pausa no programa e aguarda a leitura do teclado,
        //se lastCase for false ele aguarda a leitura do teclado se não se o lastcase for true ele somente fechará o pause.
        if (lastCase == false) {
            System.out.println("Pressione qualquer tecla pra continuar...");
            Scanner pause = new Scanner(System.in);
            pause.nextLine();
        } else if (lastCase == true) {
            Scanner pause = new Scanner(System.in);
            pause.close();
        }
    }

    public void menu() {
        //Exibe o menu para o usuario.
        System.out.print("\033[H\033[2J");

        System.out.println("---------------------------------------");
        System.out.println("                MENU                   ");
        System.out.println("                                       ");
        System.out.println("  1 - Cadastrar.                       ");
        System.out.println("                                       ");
        System.out.println("  2 - Consultar Livro.                 ");
        System.out.println("                                       ");
        System.out.println("  3 - Listar todos os livros.          ");
        System.out.println("                                       ");
        System.out.println("  4 - Consultar o genero.              ");
        System.out.println("                                       ");
        System.out.println("  5 - Consultar pelo autor.            ");
        System.out.println("                                       ");
        System.out.println("  6 - Emprestimo de livro.             ");
        System.out.println("                                       ");
        System.out.println("  7 - Sair do programa                 ");
        System.out.println("---------------------------------------");
        System.out.println("Escolha uma das opcoes:");
    }
}
