package Revisao_final.Prova0.Questao5;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro("123", "Machado de Assis", "Editora X", "Dom Casmurro");
        Livro l2 = new Livro("456", "J. K. Rowling", "Rocco", "Harry Potter");
        Livro l3 = new Livro("789", "George Orwell", "Companhia das Letras", "1984");

        biblioteca.AdicionarLivro(l1);
        biblioteca.AdicionarLivro(l2);
        biblioteca.AdicionarLivro(l3);

        biblioteca.ImprimirLivros();

        biblioteca.livroExiste(l2);
        biblioteca.RemoverLivro(l2);
        biblioteca.livroExiste(l2);

        biblioteca.obterLivro(new Livro("789", "", "", ""));

        biblioteca.estaVazia();
    }
    
}
