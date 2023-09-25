package Programa;

public class Emprestimo {
    private Livro livro; // Referência ao livro emprestado
    private String dataEmprestimo; // Data em que o empréstimo foi feito
    private String dataDevolucao; // Data de devolução prevista

    // Construtor
    public Emprestimo(Livro livro, String dataEmprestimo, String dataDevolucao) {
        this.livro = livro; // Inicializa o atributo livro com o valor passado como parâmetro
        this.dataEmprestimo = dataEmprestimo; // Inicializa o atributo dataEmprestimo com o valor passado como parâmetro
        this.dataDevolucao = dataDevolucao; // Inicializa o atributo dataDevolucao com o valor passado como parâmetro
    }

    // Gets e Sets
    public Livro getLivro() {
        return livro; // Retorna o livro emprestado
    }

    public void setLivro(Livro livro) {
        this.livro = livro; // Atualiza o livro emprestado com o valor passado como parâmetro
    }

    public String getDataEmprestimo() {
        return dataEmprestimo; // Retorna a data de empréstimo
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo; // Atualiza a data de empréstimo com o valor passado como parâmetro
    }

    public String getDataDevolucao() {
        return dataDevolucao; // Retorna a data de devolução prevista
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao; // Atualiza a data de devolução prevista com o valor passado como parâmetro
    }
}
