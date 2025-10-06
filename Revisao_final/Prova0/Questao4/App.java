package Revisao_final.Prova0.Questao4;

public class App {
    public static void main(String[] args) {
        CadastroIdade cadastroIdade = new CadastroIdade(0);

        try{
            IdadeInvalidaException.setIdade(0);
        }catch(IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }
            
    }
}
