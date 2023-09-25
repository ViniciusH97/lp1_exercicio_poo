package Programa;

public class Livro {
    private String nome; // Nome do livro
    private int codigo; // Código identificador do livro
    private String genero; // Gênero do livro
    private String autor; // Autor do livro

    public Livro(String nome, int codigo, String genero, String autor) {
        this.nome = nome; // Inicializa o atributo nome com o valor passado como parâmetro
        this.codigo = codigo; // Inicializa o atributo codigo com o valor passado como parâmetro
        this.genero = genero; // Inicializa o atributo genero com o valor passado como parâmetro
        this.autor = autor; // Inicializa o atributo autor com o valor passado como parâmetro
    }

    // Gets

    public int getCodigo() {
        return codigo; // Retorna o código do livro
    }

    public String getGenero() {
        return genero; // Retorna o gênero do livro
    }

    public String getAutor() {
        return autor; // Retorna o autor do livro
    }

    public void imprimir() {
        System.out.println("Nome: " + nome); // Imprime o nome do livro
        System.out.println("Código: " + codigo); // Imprime o código do livro
        System.out.println("Gênero: " + genero); // Imprime o gênero do livro
        System.out.println("Autor: " + autor); // Imprime o autor do livro
    }
}
