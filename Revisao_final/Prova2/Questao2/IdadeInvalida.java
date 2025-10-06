package Revisao_final.Prova2.Questao2;

public class IdadeInvalida extends Exception{
    public IdadeInvalida(){
        super("\nErro, a idade deve ser maior que 18 anos\n");
    }
    
    public IdadeInvalida(String menssagemIdade){
        super(menssagemIdade);
    }

    public static void setIdade(int idade) throws IdadeInvalida {
        if (idade>=18){
            System.out.println("\nIdade cadastrada com sucesso\n");
        }else{
            throw new IdadeInvalida();
        }
    }
}
