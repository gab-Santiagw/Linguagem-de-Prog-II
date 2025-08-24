package Atividade_de_coleções;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppLivro {
        public static void main(String[] args) {
                List<Livro> listaLivros = new ArrayList<Livro>();
                Set<Integer> isbn = new HashSet<Integer>();
                Map<Integer, Livro> mapaLivros = new HashMap<Integer,Livro>();

                adicionarLivro(new Livro(101, "Machado de Assis", "Editora A", "Dom Casmurro"), listaLivros, isbn, mapaLivros);
                adicionarLivro(new Livro(102, "J.K. Rowling", "Editora B", "Harry Potter"), listaLivros, isbn, mapaLivros);
                adicionarLivro(new Livro(104, "Clarice Lispector", "Editora C", "A Hora da Estrela"), listaLivros, isbn, mapaLivros);

                System.out.println("\n --> Imprimir Lista: \n");
                imprimirLivros(listaLivros);

                System.out.println("\n --> Verificar existência: \n");
                System.out.println("Livro existe? " + existeLivro(new Livro(102, "", "", ""), listaLivros));

                System.out.println("\n --> Obter Livro: \n");
                Livro l = obterLivro(new Livro(102, "", "", ""), listaLivros);
                if (l != null) {
                        System.out.println("\n Livro encontrado: " + l);
                } else {
                        System.out.println("\n Livro não encontrado.");
                }

                System.out.println("\n --> Remoção: \n");
                removerLivro(new Livro(101, "", "", ""), listaLivros, isbn, mapaLivros);
                imprimirLivros(listaLivros);

                System.out.println("\n --> Nova lista após a remoção: \n");
                imprimirLivros(listaLivros);

                System.out.println("\n --> Verificar se a lista está vázia: \n");
                System.out.println(listaVazia(listaLivros));

                System.out.println("\n --> Remoção total da lista: \n");
                removerLivro(new Livro(102, "", "", ""), listaLivros, isbn, mapaLivros);
                removerLivro(new Livro(104, "", "", ""), listaLivros, isbn, mapaLivros);
                imprimirLivros(listaLivros);

                System.out.println("\n --> Teste com uma lista vázia: \n");
                System.out.println(listaVazia(listaLivros));
        } 

        static void adicionarLivro(Livro livro, List<Livro> listaLivros, Set<Integer> isbn, Map<Integer, Livro> mapa) {
                        
                if (isbn.contains(livro.isbn)) {
                         System.out.println("Erro: Número do livro " + livro.isbn + " já existe! Livro não cadastrado.");
                } else {
                        listaLivros.add(livro);
                        isbn.add(livro.isbn);
                        mapa.put(livro.isbn, livro);
                        System.out.println("Livro cadastrado: " + livro);
                }
        }

       static void removerLivro(Livro livro, List<Livro> lista, Set<Integer> isbns, Map<Integer, Livro> mapa) {
                if (isbns.contains(livro.isbn)) {
                        lista.removeIf(l -> l.isbn == livro.isbn); 
                        isbns.remove(livro.isbn);                  
                        mapa.remove(livro.isbn);                   
                        System.out.println("Livro removido: ISBN " + livro.isbn);
                } else {
                        System.out.println("Erro: ISBN " + livro.isbn + " não encontrado! Nenhum livro removido.");
                }
        }

        static void imprimirLivros(List<Livro> lista) {
                if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                } else {
                        for (Livro l : lista) {
                                System.out.println(l);
                        }
                }
        }

        static boolean existeLivro(Livro livro, List<Livro> lista) {
                for (Livro l : lista) {
                        if (l.isbn == livro.isbn) {
                                return true;
                        }
                }
                return false;
        
        }

        static Livro obterLivro(Livro livro, List<Livro> lista) {
                for (Livro l : lista) {
                        if (l.isbn == livro.isbn) {
                                return l;
                        }
                }
                return null;
        }

        static boolean listaVazia(List<Livro> lista) {
                return lista.isEmpty();
        }

}
