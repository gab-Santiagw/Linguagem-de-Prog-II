package Revisao_final.Prova2.Questao2;

public class SalarioInvalido extends Exception{
    public SalarioInvalido(){
        super("\nErro, valor do salario deve ser entre 1000 e 20000!!!\n");
    }

    public SalarioInvalido(String menssagemSalario){
        super(menssagemSalario);
    }
    
    public static void setSalario(double salario) throws SalarioInvalido{
        if(salario>=1000 && salario<=20000){
            System.out.println("\nO seguinte salario foi cadastrado com sucesso:" + salario + "\n");
        }else{
            throw new SalarioInvalido();
        }
    }
}
