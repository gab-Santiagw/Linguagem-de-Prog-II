package Revisao_final.Prova0.Questao5;

public class Livro {
    String isbn, autor, editora, titulo;

    public Livro(String isbn, String autor, String editora, String titulo){
        this.isbn=isbn;
        this.autor=autor;
        this.editora=editora;
        this.titulo=titulo;
    }

    public String getIsbn(){return isbn;}
    public void setIsbn(String isbn){this.isbn=isbn;}

    public String getAutor(){return autor;}
    public void setAutor(String autor){this.autor=autor;}

    public String getEditora(){return editora;}
    public void setEditora(String editora){this.editora=editora;}

    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo){this.titulo=titulo;}

    
}
