package Revisao_final.Prova1.Questao2;

public class Biblioteca {
    private String nome;
    private Livro[] livros;  // agregação com Livro
    private int qtdLivros;   // controla quantos livros já foram adicionados

    // Construtor
    public Biblioteca(String nome, int capacidade) {
        this.nome = nome;
        this.livros = new Livro[capacidade]; // array de livros
        this.qtdLivros = 0;
    }

    // Adicionar livro
    public void adicionarLivro(Livro livro) {
        if (qtdLivros < livros.length) {
            livros[qtdLivros] = livro;
            qtdLivros++;
        } else {
            System.out.println("A biblioteca está cheia!");
        }
    }

    // Exibir todos os livros
    public void listarLivros() {
        System.out.println("Biblioteca: " + nome);
        for (int i = 0; i < qtdLivros; i++) {
            System.out.println(livros[i].infoLivro());
        }
    }
}
