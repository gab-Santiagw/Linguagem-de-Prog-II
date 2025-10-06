package Revisao_final.Prova0.Questao4;

public class IdadeInvalidaException extends Exception{
    
    public IdadeInvalidaException(){
        super("Erro, idade deve ser acima de 0");
    }

    public IdadeInvalidaException(String MenssagemIdade){
        super(MenssagemIdade);
    }    

    public static void setIdade(int idade) throws IdadeInvalidaException{
        if (idade > 0){
            System.out.print("A seguinte idade foi validada com sucesso: " + idade);
        }else{
            throw new IdadeInvalidaException();
        }
    }
    
}
