package Revisao_final.Prova1.Questao2;

public class AppBiblioteca {
    public static void main (String[] args){
        Autor autor1 = new Autor("Machado de Assis", "Brasileiro");
        Autor autor2 = new Autor("George Orwell", "Britânico");

        // Criando livros (cada livro tem um autor)
        Livro livro1 = new Livro("Dom Casmurro", 1899, autor1);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", 1881, autor1);
        Livro livro3 = new Livro("1984", 1949, autor2);

        // Criando biblioteca com espaço para 5 livros
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", 5);

        // Adicionando livros
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Listando os livros
        biblioteca.listarLivros();
    
    }
}
