package Revisao_final.Prova1.Questao2;

public class Autor {
    private String nome;
    private String nacionalidade;

    // Construtor
    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    // Exibir informações
    public String infoAutor() {
        return nome + " (" + nacionalidade + ")";
    }
}
