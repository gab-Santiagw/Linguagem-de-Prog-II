package Revisao.Questao_5;

public class Livro {
    String isbn, autor, editora, titulo;
    
    public Livro(String isbn, String autor, String editora, String titulo) {
        this.isbn=isbn;
        this.autor=autor;
        this.editora=editora;
        this.titulo=titulo;
    }
    @Override
    public String toString() {
        return titulo + " (ISBN: " + isbn + ", Autor: " + autor + ", Editora: " + editora + ")";
    }
}
