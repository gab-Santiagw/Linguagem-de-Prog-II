package Revisao_final.Prova0.Questao5;
import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> listaLivros = new ArrayList<>();

    public void AdicionarLivro(Livro livro){
        listaLivros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void RemoverLivro(Livro livro){
        if (listaLivros.remove(livro)) {
            System.out.println("Livro removido: " + livro.getTitulo());
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    public void ImprimirLivros(){
        if (listaLivros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Lista de livros:");
            for (Livro l : listaLivros) {
                System.out.println("- " + l.getTitulo() + " | Autor: " + l.getAutor() + " | ISBN: " + l.getIsbn());
            }
        }
    }

    public void livroExiste(Livro livro){
        if (listaLivros.contains(livro)) {
            System.out.println("O livro " + livro.getTitulo() + " está cadastrado na biblioteca.");
        } else {
            System.out.println("O livro " + livro.getTitulo() + " NÃO está cadastrado.");
        }
    }

    public void obterLivro(Livro livro){
        for (Livro l : listaLivros) {
            if (l.getIsbn().equals(livro.getIsbn())) {
                System.out.println("Livro encontrado: " + l.getTitulo());
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public boolean estaVazia() {
        return listaLivros.isEmpty();
    }

}
