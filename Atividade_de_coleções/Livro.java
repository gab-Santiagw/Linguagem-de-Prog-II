package Atividade_de_coleções;

public class Livro {
    int isbn;
    String autor;
    String editora;
    String titulo;

    public Livro(int isbn, String autor, String editora, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo + " (ISBN: " + isbn + ", Autor: " + autor + ", Editora: " + editora + ")";
    }
}