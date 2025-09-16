package Revisao.Questao_4;

public class App {
    int idade;

    public App(int idade) {
        this.idade = idade;
    }

    public void teste() throws IdadeInvalidaException {
        if (idade <= 0) {
            throw new IdadeInvalidaException();
        } else {
            System.out.println("Nenhum erro foi encontrado");
        }
    }

    public static void main(String[] args) {
        try {
            App app = new App(0);
            app.teste();
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

