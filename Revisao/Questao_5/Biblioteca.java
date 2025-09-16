package Revisao.Questao_5;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro>livros=new ArrayList<>();
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public void removerLivro(Livro livro){
        livros.remove(livro);
    }
    public void imprimirLivro(){
        System.out.println(livros);
    }
    public boolean livroExiste(Livro livro){
        return livros.contains(livro);
    }
    public Livro obterLivro(Livro livro){
        for (Livro l : livros) {
            if (l.equals(livro)) {
                return l;
            }
        }
        return null;
    }
    public boolean estaVazia(){
        return livros.isEmpty();
    }
}
